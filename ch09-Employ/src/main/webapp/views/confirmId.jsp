<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%> <%-- json방식 사용, 설정에 의해 만들어지는 공백 제거 --%>
<%@ page import="kr.semployee.dao.SemployeeDAO" %>
<%@ page import="kr.semployee.vo.SemployeeVO" %>
<%
//전송된 데이터 인코딩 처리
	request.setCharacterEncoding("utf-8");
	//전송된 데이터 반환
	String id = request.getParameter("id");
	
	SemployeeDAO dao = SemployeeDAO.getInstance();
	SemployeeVO member = dao.checkMember(id);
	if(member!=null){//아이디가 중복(행이 만들어지지 않음)
%>
	{"result":"idDuplicated"}
<%
	}else{//아이디 미중복 - null된경우
%>
	{"result":"idNotFound"}
<%		
	}
%>

