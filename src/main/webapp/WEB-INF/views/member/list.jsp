<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>임시 회원 목록 입니다..</h1>
<%--<h2>${LoginId}</h2>--%>
<h2>${cookie.LoginId.value}</h2>
<a href="/">홈으로</a>
</body>
</html>