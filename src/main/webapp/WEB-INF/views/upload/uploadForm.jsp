
<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>파일 업로드 화면</title>
</head>
<body>
	<h2>Spring MVC 파일 업로드 예제</h2>
	<form method="post" enctype="multipart/form-data">
		<input type="file" name="uploadfiles" multiple><br>
		<input type="text" name="uploader" placeholder="업로더"><br> 
		<input type="text" name="description" placeholder="파일설명"><br>
		<button type="submit">업로드</button>
	</form>
</body>
</html>



