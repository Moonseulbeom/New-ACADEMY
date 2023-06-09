<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.semployee.dao.SemployeeDAO" %>
<%@ page import="kr.semployee.vo.SemployeeVO" %>
<%
Integer user_num = (Integer)session.getAttribute("user_num");
	if(user_num==null){//로그인이 되지 않은 경우
		response.sendRedirect("loginForm.jsp");
	}else{//로그인 된 경우
		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("utf-8");
		//자바빈을 생성하고 전송된 데이터를 저장
		SemployeeVO member = new SemployeeVO();
		member.setNum(user_num); //session에서 빼온거
		member.setName(
		request.getParameter("name"));
		member.setPasswd(
		request.getParameter("passwd"));
		
		//salary를 int로 변환
		int salary = Integer.parseInt(request.getParameter("salary"));
		member.setSalary(salary);
		/* member.setSalary(
		request.getParameter("salary")); */
		member.setJob(
		request.getParameter("job"));

		SemployeeDAO dao = SemployeeDAO.getInstance();
		dao.updateMember(member);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정 완료</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
<div class="page-main">
	<h1>회원정보수정 완료</h1>
	<div class="result-display">
		회원정보수정 완료!<br>
		<button onclick="location.href='myPage.jsp'">MyPage</button>
	</div>
</div>
</body>
</html>
<%
	}
%>
