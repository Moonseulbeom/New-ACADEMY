<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 수정</title>
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
	<h2>상품 정보 수정</h2>
	<form id="modify_form" action="modify.do"
								method="post">
	<%-- 글수정시에 num값을 hidden으로 넘겨줘야함 --%>
	<input type="hidden" name="num" value="${productVO.num}">
	
		<ul>
			<li>
				<label for="name">상품명</label>
				<input type="text" name="name"
					value="${productVO.name}"
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
				<label for="price">가격</label>
				<input type="text" name="price"
					value="${productVO.price}"
					id="price" size="10" maxlength="10"
										class="input-check">
			</li>
			<li>
				<label for="stock">재고</label>
				<input type="text" name="stock"
					value="${productVO.stock}"
					id="stock" size="10" maxlength="10"
										class="input-check">
			</li>
			<li>
				<label for="origin">원산지</label>
				<input type="text" name="origin"
					value="${productVO.origin}"
					id="origin" size="10" maxlength="10"
										class="input-check">
			</li>
		</ul>
		<div class="align-center">
			<input type="submit" value="상품 정보 수정">
			<input type="button" value="상품 목록"
						onclick="location.href='list.do'">
		</div>
	</form>
</div>
</body>
</html>