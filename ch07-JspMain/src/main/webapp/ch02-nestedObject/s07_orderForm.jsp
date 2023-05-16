<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[실습]상품 구매</title>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById('myForm').onsubmit = function(){
			
			if(!check('name','이름')){
				return false;
			};
			if(!check('order_date','배송희망일')){
				return false;
			};
			
			let buy_item = document.getElementsByName('item');
			let num = 0;
			for(let i=0;i<buy_item.length;i++){
				if(buy_item[i].checked){
					num++;
				}
			}
			if(num < 1){
				alert("1개 이상의 상품을 선택하세요!");
				return false;
			}
		function check(id, name){
			let check_item = document.getElementById(id);
			//alert(check_item.value);
			if(check_item.value.trim()==''){
				alert(name+"을 입력하세요!");
				check_item.focus();
			}
			else
				return true;
		}
	}
}
</script>
</head>
<body>
<%--
이름, 배송희망일 필수 입력, 상품은 하나 이상 꼭 선택
 --%>
<form action="s08_order.jsp" method="post" id="myForm">
	이름 <input type="text" name="name" id="name"><br>
	배송희망일 <input type="date" name="order_date" id="order_date"><br>
	상품(30만원 미만 배송비 5천원 추가) :
	<input type="checkbox" name="item" value="가방">가방(20만원)
	<input type="checkbox" name="item" value="신발">신발(10만원)
	<input type="checkbox" name="item" value="옷">옷(5만원)
	<input type="checkbox" name="item" value="식사권">식사권(15만원)
	<br>
	<input type="submit" value="전송">
</form>
</body>
</html>