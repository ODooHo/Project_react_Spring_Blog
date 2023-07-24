import { Box, Button, Card, CardContent, TextField, Typography } from "@mui/material";
import React, { useState } from "react";
import { useCookies } from "react-cookie";
import { PatchUserApi } from "../../../apis";

interface PatchUserProps {
  onMainClick: () => void;
  currentPage: string;
}

export default function PatchUser({
  onMainClick,
  currentPage,
}: PatchUserProps) {
  const [userNickname, setUserNickname] = useState<string>("");
  const [userProfile, setUserProfile] = useState<string>("");
  const [cookies] = useCookies();

  const patchUserHandler = async () => {
    const data = {
      userNickname,
      userProfile,
    };

    const token = cookies.token;
    const patchUserResponse = await PatchUserApi(data, token);
    if (!patchUserResponse) {
      alert("프로필 수정에 실패했습니다.");
      return;
    }
    if (!patchUserResponse.result) {
      alert("프로필 수정에 실패했습니다.");
      return;
    }

    alert("게시글 작성에 성공했습니다!");

    onMainClick();
  };

  return (
    <>
      <Box marginTop={"50px"} padding={5}>
      <Typography variant="h5" marginBottom={"10px"}>프로필 변경</Typography>
        <Card>
          <CardContent>
            <TextField
              label="닉네임"
              value={userNickname}
              onChange={(e) => setUserNickname(e.target.value)}
            />
            <Box marginTop={"10px"}>
            <Button variant="contained" component="label">
              사진 첨부
              <input
                type="file"
                hidden
                onChange={(e) => setUserProfile(e.target.value)}
              />
            </Button>
            </Box>
          </CardContent>
        </Card>
      </Box>
      <Button
        variant="contained"
        color="inherit"
        sx={{ margin: "10px", backgroundColor: "#000000", color: "#ffffff" }}
        onClick={patchUserHandler}
      >
        작성 완료
      </Button>

      <Button
        variant="contained"
        color="inherit"
        sx={{ margin: "10px", backgroundColor: "#ffffff", color: "#000000" }}
        onClick={onMainClick}
      >
        취소
      </Button>
    </>
  );
}