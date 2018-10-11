<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="resources/css/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Title</title>
</head>

<body>
<nav>
    <ul class="nav nav-tabs">
        <a href="#" class="main" style="color: white">PROJECT</a>
        <li class="nav-item">
            <a class="nav-link active" href="#">BOARD</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#" style="color: white">Link</a>
        </li>
        <li class="nav-item">
            <a class="nav-link " href="#" style="color: white">Disabled</a>
        </li>
    </ul>
</nav>

    <section>
      <c:forEach items="${questionList}" var="question">
        <article>
            <table class="center">
                <tr rowspan="2">
                    <td width="70%"> <a href="question?id=${question.id}">${question.title}</a> </td>
                    <td class="text-right"> ${question.createDate} </td>
                </tr>
                <tr>
                    <td colspan="3"> 내용 </td>
                </tr>
            </table>
        </article>
        </c:forEach>

        <div class="right"><a class="btn btn-outline-secondary" href="qregister">글쓰기</a></div>

        <div class="text-center">
            <ul class="pagination justify-content-center">
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                        <span class="sr-only">Previous</span>
                    </a>
                </li>
                <c:forEach items="${pageStartList}" var="pageIndex" varStatus="status">
                <li class="page-item"><a class="page-link" href="list?start=${pageIndex}">${status.index + 1}</a></li>
                </c:forEach>
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                        <span class="sr-only">Next</span>
                    </a>
                </li>
            </ul>
        </div>
    </section>

    <footer>
        footer
    </footer>

</body>

</html>