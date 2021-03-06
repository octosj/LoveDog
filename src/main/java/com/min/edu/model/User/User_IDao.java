package com.min.edu.model.User;

import java.util.List;
import java.util.Map;

import com.min.edu.dto.Hospi_Dto;
import com.min.edu.dto.User_Dto;

public interface User_IDao {
	// 회원 탈퇴
	public boolean DeleteUser(String u_id);
	// 회원 조회(리스트)
	public List<User_Dto> SelectAlluser();
	// 회원 단일 조회
	public User_Dto SelectOneuser(String u_id);
	// 권한 수정
	public boolean AuthChange(Map<String, String> map);
	// 회원 수정
	public boolean UserModify(User_Dto dto);
	// 마이페이지
	public User_Dto Mypage();
	// 병원 전체 조회
	public List<Hospi_Dto> SelectAllhospital();
	// 병원 단일 조회
	public Hospi_Dto SelectOnehospital(String u_id);
}
