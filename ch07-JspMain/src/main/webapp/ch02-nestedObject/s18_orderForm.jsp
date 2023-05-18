<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>식사 주문</title>
<script type="text/javascript">
	window.onload=function(){
		let myForm = 
			document.getElementById('myForm');
		//이벤트 연결
		myForm.onsubmit=function(){
			let items = 
				document.querySelectorAll(
						'input[type="number"]');
			for(let i=0;i<items.length;i++){
				if(items[i].value==''){
					let label = 
						document.querySelector(
							'label[for="'+items[i].id+'"]');//유니크하게 접근해서 레이블의 id에 접근
					alert(label.textContent 
							+ '의 수량을 입력하세요!');
					items[i].value = 0;
					items[i].focus();
					return false;//submit 안되게 하려고
				}
			}//end of for
			if(items[0].value==0 &&
			   items[1].value==0 &&
			   items[2].value==0){
				alert('세가지 음식 중 하나는 꼭 주문해야 합니다.');
				return false;
			}	
		};
	};
</script>
</head>
<body>
<%--
유효성 체크 : 짜장면, 짬뽕, 볶음밥을 수량 입력 필수
		   세가지 음식 중 하나는 꼭 주문해야 함(주문 안할꺼면 0)
--%>
<div align="center">
	<h2>식사 주문</h2>
	<form action="s19_order.jsp" method="post" id="myForm">
		<table>
			<tr>
				<td class="title">식사류</td>
				<td>
					<ul>
						<li>
							<label for="c0">짜장면</label>
							<input type="number" 
								name="food_c0" id="c0"
								min="0" max="99" value="0">
						</li>
						<li>
							<label for="c1">짬뽕</label>
							<input type="number" 
								name="food_c1" id="c1"
								min="0" max="99" value="0">
						</li>
						<li>
							<label for="c2">볶음밥</label>
							<input type="number" 
								name="food_c2" id="c2"
								min="0" max="99" value="0">
						</li>
					</ul>
				</td>
			</tr>
			<tr align="center">
				<td colsapn="2">
					<input type="submit" value="전송">
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>