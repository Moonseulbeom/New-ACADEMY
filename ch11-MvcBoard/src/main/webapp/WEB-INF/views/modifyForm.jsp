<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<script type="text/javascript">
	window.onload=function(){
		let myForm = document.getElementById('modify_form');
		//이벤트 연결
		myForm.onsubmit=function(){
			//===유효성 체크 시작===//
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
			}//end of for
			//===유효성 체크 끝===//
		};
	};
</script> 
</head>
<body>
<div class="page-main">
	<h2>글 수정</h2>
	<form id="modify_form" action="modify.do"
								method="post">
	<%-- 글수정시에 num값을 hidden으로 넘겨줘야함 --%>
	<input type="hidden" name="num" value="${boardVO.num}">
	
		<ul>
			<li>
				<label for="title">제목</label>
				<input type="text" name="title"
					value="${boardVO.title}"
					id="title" size="30" maxlength="50"
										class="input-check">
			</li>
			<li>
				<label for="name">이름</label>
				<input type="text" name="name"
					value="${boardVO.name}"
					id="name" size="10" maxlength="10"
										class="input-check">
			</li>
			<li>
				<label for="passwd">비밀번호</label>
				<input type="password" name="passwd"
					id="passwd" size="12" maxlength="12"
										class="input-check">
			</li>
			<li>
				<label for="email">이메일</label>
				<input type="email" name="email"
					value="${boardVO.email}"
					id="email" size="20" maxlength="50"
										class="input-check">
			</li>
			<li>
				<label for="phone">전화번호</label>
				<input type="text" name="phone"
					value="${boardVO.phone}"
					id="phone" size="15" maxlength="15">
			</li>
			<li>
				<label for="content">내용</label>
				<textarea rows="5" cols="40"
				name="content" id="content" class="input-check">${boardVO.content}</textarea>
			</li>
		</ul>
		<div class="align-center">
			<input type="submit" value="글 수정">
			<input type="button" value="목록"
						onclick="location.href='list.do'">
		</div>
	</form>
</div>
</body>
</html>