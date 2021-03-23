<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>파일업로드</title>
</head>
<body>
<form action="/admin/banner.do" method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <th>제목</th>
            <td><input type="text" id="title" name="banTitle"></td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea rows="5" cols="30" name="banContent"></textarea></td>
        </tr>
        <tr>
            <th>이미지</th>
            <td><input type="file" id="banImage" name="banImage"></td>
        </tr>
        <tr>
            <td colspan="6">
                <div style="text-align: center;">
                    <input type="submit" value="글작성">
                    <input type="reset" value="취소" >
                </div>
            </td>
        </tr>
    </table>

</form>

</body>
</html>