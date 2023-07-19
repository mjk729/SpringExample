<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax 테스트</title>
</head>
<body>

	<h1>Ajax 테스트</h1>

	<button type="button" id="btn">버튼</button>
	
	<div id="nameDiv"></div>
	<div id="ageDiv"></div>


	<script src="https://code.jquery.com/jquery-3.7.0.min.js"
		integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
		crossorigin="anonymous"></script>

	<script>
		$(document).ready(function(){
		
		$("#btn").on("click", function(){
			
			$.ajax({
				type:"get"
				, url:"/ajax/person"
				// , data:{"":""} 파라미터가 없음으로 생략 가능
				, success: function(data){
					console.log(data);
					
					$("#nameDiv").text(data.name);
					$("#ageDiv").text(data.age);
				}
				, error: function(){
					alert("에러발생!!");
				}
			})
		});
		});
		
	</script>


</body>
</html>