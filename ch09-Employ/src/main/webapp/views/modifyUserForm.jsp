<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.semployee.dao.SemployeeDAO" %>
<%@ page import="kr.semployee.vo.SemployeeVO" %>
<%
Integer user_num = (Integer)session.getAttribute("user_num");
	if(user_num==null){//로그인이 되지 않은 경우
		response.sendRedirect("loginForm.jsp");
	}else{//로그인 된 경우
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
<script type="text/javascript">
	window.onload=function(){
		let form = document.getElementById('modify_form');
		
		//이벤트 연결
		form.onsubmit=function(){
			let items = 
				document.querySelectorAll('.input-check');
			for(let i=0;i<items.length;i++){
				if(items[i].value.trim()==''){
					let label = document.querySelector(
						               'label[for="'+items[i].id+'"]');
					alert(label.textContent + ' 항목 필수 입력');
					items[i].value = '';
					items[i].focus();
					return false;
				}
			}
		};
	}
</script>
</head>
<body>
<%
	SemployeeDAO dao = SemployeeDAO.getInstance();
	SemployeeVO member = dao.getMember(user_num);
	if(member.getJob()==null){
		member.setJob("");
	}
%>
<div class="page-main">
	<h1>회원정보수정</h1>
	<form action="modifyUser.jsp"
	       method="post" id="modify_form">
		<ul>
			<li>
				<label for="name">이름</label>
				<input type="text" name="name" 
				   value="<%= member.getName() %>";
				   id="name" maxlength="10" class="input-check">
			</li>
			<li>
				<label for="passwd">비밀번호</label>
				<input type="password" name="passwd" 
				   id="passwd" maxlength="12" class="input-check">
			</li>
			<li>
				<label for="salary">급여</label>
				<input type="text" name="salary"
				   value="<%= member.getSalary() %>";
				   id="salary" maxlength="50" class="input-check">
			</li>
			<li>
				<label for="job">직업</label>
				<input type="text" name="job"
				   value="<%= member.getJob() %>";
				   id="job" maxlength="15">
			</li>
		</ul>
		<div class="align-center">
			<input type="submit" value="수정">
			<input type="button" value="홈으로"
			  onclick="location.href='main.jsp'">
		</div>       
	</form>
</div>
</body>
</html>
<%
	}
%>