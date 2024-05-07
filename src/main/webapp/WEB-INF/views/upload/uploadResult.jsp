<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html  lang="ko">
<head>
<meta charset="utf-8">
<title>파일 업로드</title>
</head>
<body>
<h2>정상적으로 파일 업로드 처리되었습니다.</h2>
업로더 : ${uploader}<br>
파일 설명 : ${description}<br>
업로드파일목록
<ul>
	<c:forEach items="${uploadFiles}" var="file">
	<li>업로드 파일명(${file.uploadFileName}) / 저장 파일명(${file.storeFileName})</li>
	</c:forEach>
</ul>
</body>
</html>




