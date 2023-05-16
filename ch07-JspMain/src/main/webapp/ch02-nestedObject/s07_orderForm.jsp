<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[실습]상품 구매</title>
<script type="text/javascript">
	window.onload=function(){
		let myForm = 
			document.getElementById('myForm');
		//이벤트 연결
		myForm.onsubmit=function(){
			if(!check('name','이름')){
				return false;
			}
			if(!check('order_date','배송희망일')){
				return false;
			}
		};
		
		function check(item,name){
			let check_item = document.getElementById(item);
			if(check_item.value.trim()==''){
				alert(name + " 필수");
				check_item.value = '';
				check_item.focus();
				return false;
			}
		
		//가격 정보
        const product = {
            c0:200000,
            c1:100000,
            c2:50000,
            c3:150000
        };
        let sum = 0; //총 상품 가격
        let ship = 0; //배송비

        //checkbox 접근방법(name속성 접근)
        // let inputs = document.getElementsByName('goods');
        //css접근방식
        let inputs = document.querySelectorAll('input[type="checkbox"]');

        //이벤트 연결
        for(let i=0;i<inputs.length;i++){
            inputs[i].onclick=function(){
                //총 상품 가격
                if(this.checked){//체크박스 선택시
                    sum += product[this.id];
                }else{//체크박스 해제시
                    sum -= product[this.id];
                }

                //배송비 구하기
                if(sum > 0 && sum < 300000){
                    ship = 5000;
                }else{//sum이 300000원 이상 또는 0일 경우 
                    ship = 0;
                }

            };
        }
		
			return true;
		}
		
	};
</script>
</head>
<body>
<%--
이름, 배송희망일 필수 입력, 상품은 하나 이상 꼭 선택
--%>
<form action="s08_order.jsp" method="post" id="myForm">
	이름 <input type="text" name="name" id="name"><br>
	배송희망일 <input type="date" name="order_date" id="order_date"><br>
	상품 (30만원 미만 배송비 5천원 추가) : 
	<input type="checkbox" name="item" value="가방">가방(20만원)
	<input type="checkbox" name="item" value="신발">신발(10만원)
	<input type="checkbox" name="item" value="옷">옷(5만원)
	<input type="checkbox" name="item" value="식사권">식사권(15만원)
	<input type="submit" value="전송">
</form>
</body>
</html>