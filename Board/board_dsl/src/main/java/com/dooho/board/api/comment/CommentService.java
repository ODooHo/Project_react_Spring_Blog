package com.dooho.board.api.comment;

import com.dooho.board.api.ResponseDto;
import com.dooho.board.api.board.BoardEntity;
import com.dooho.board.api.board.BoardRepository;
import com.dooho.board.api.comment.dto.CommentDto;
import com.dooho.board.api.comment.dto.PatchCommentDto;
import com.dooho.board.api.comment.dto.PatchCommentResponseDto;
import com.dooho.board.api.user.UserEntity;
import com.dooho.board.api.user.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;
    private final UserRepository userRepository;

    public CommentService(CommentRepository commentRepository, BoardRepository boardRepository,
                          UserRepository userRepository) {
        this.commentRepository = commentRepository;
        this.boardRepository = boardRepository;
        this.userRepository = userRepository;
    }


    public ResponseDto<String> register(String userEmail, Integer boardId, CommentDto dto) {
        UserEntity user = userRepository.getReferenceById(userEmail);
        BoardEntity board = boardRepository.getReferenceById(boardId);
        CommentEntity commentEntity = CommentEntity.of(null, LocalDate.now(), dto.commentContent(), board, user);
        commentRepository.save(commentEntity);


        return ResponseDto.setSuccess("Success", "Success");

    }

    @Transactional(readOnly = true)
    public ResponseDto<List<CommentDto>> getComment(Integer boardId) {
        List<CommentDto> commentList = commentRepository.findAllByBoard_Id(boardId)
                .stream()
                .map(CommentDto::from)
                .toList();
        return ResponseDto.setSuccess("Success", commentList);
    }

    public ResponseDto<PatchCommentResponseDto> editComment(Integer boardId, Integer commentId, PatchCommentDto dto) {
        CommentEntity comment = null;
        String commentContent = dto.getCommentContent();
        LocalDate commentWriteDate = dto.getCommentWriteDate();

        comment = commentRepository.findById(commentId).orElse(null);
        comment.setCommentContent(commentContent);
        comment.setCommentWriteDate(commentWriteDate);

        commentRepository.save(comment);

        PatchCommentResponseDto patchCommentResponseDto = new PatchCommentResponseDto(comment);

        return ResponseDto.setSuccess("Success!", patchCommentResponseDto);
    }


    public ResponseDto<String> deleteComment(Integer commentId) {
        commentRepository.deleteById(commentId);
        return ResponseDto.setSuccess("Success", "Delete Comment Success");
    }


}
