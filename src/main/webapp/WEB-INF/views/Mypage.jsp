<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table,th {
	border: 1px solid black;
	}
	tr, td{
		border: 1px solid black;
	}
</style>
</head>
<body>

	<div>
		<h2 align="right">병원 정보 게시판</h2>
	</div>
	<div>
	<img alt="프로필 사진" src="">
	
		<table>
			<tr>
				<th>아이디</th>
				<td></td>
			</tr>
			<tr>
				<th>이름</th>
				<td></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td></td>
			</tr>
		</table>
		
		<div>
			<tr>
				<td>
					<input type="button" value="병원 신청" onclick="H_sin()">
					<input type="button" value="회원 수정" onclick="UserModify()">
					<input type="button" value="회원 탈퇴" onclick="deleteForm()">
				</td>
			</tr>
		</div>
	</div>

	<script type="text/javascript">
		function deleteForm() {
// 			alert("작동");
			location.href="./delete.do";
		}
		
		function UserModify() {
// 			alert("ok");
			
		}
	</script>
</body>
</html>