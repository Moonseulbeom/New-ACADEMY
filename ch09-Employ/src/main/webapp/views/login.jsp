<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.semployee.dao.SemployeeDAO" %>
<%@ page import="kr.semployee.vo.SemployeeVO" %>
<%
//전송된 데이터에 대한 인코딩 처리
	request.setCharacterEncoding("utf-8");
	//전송된 데이터 반환
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	
	SemployeeDAO dao = SemployeeDAO.getInstance();
	//id 존재 여부 확인
	SemployeeVO member = dao.checkMember(id);
	boolean check = false;
	
	if(member!=null){//id 존재
		//비밀번호 일치 여부 체크
		check = member.isCheckedPassword(passwd);
	}
	
	if(check){//인증 성공
		//로그인 처리
		session.setAttribute("user_num", member.getNum());
		session.setAttribute("user_id", id); //main.jsp의 String user_id = (String)session.getAttribute("user_id");와 같아야함 //일종의 식별자 역할
		
		//main.jsp로 리다이렉트(성공적으로 저장시)
		response.sendRedirect("main.jsp");
	}else{//아이디 또는 비밀번호 불일치
%>
	<script>
		alert('아이디 또는 비밀번호 불일치');
		history.go(-1);
	</script>
<%		
	}
%>