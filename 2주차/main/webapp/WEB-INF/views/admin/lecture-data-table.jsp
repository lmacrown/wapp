<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Wapp Team B Admin</title>
    <!-- core:css -->
    <link rel="stylesheet" href="../../../assets/vendors/core/core.css">
    <!-- endinject -->
    <!-- plugin css for this page -->
    <link rel="stylesheet" href="../../../assets/vendors/datatables.net-bs4/dataTables.bootstrap4.css">
    <!-- end plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="../../../assets/fonts/feather-font/css/iconfont.css">
    <link rel="stylesheet" href="../../../assets/vendors/flag-icon-css/css/flag-icon.min.css">
    <!-- endinject -->
    <!-- Layout styles -->
    <link rel="stylesheet" href="../../../assets/css/demo_1/style.css">
    <!-- End layout styles -->
    <link rel="shortcut icon" href="../../../assets/images/favicon.png"/>
</head>
<body class="sidebar-dark">
<div class="main-wrapper">

    <!-- partial:../../partials/_sidebar.html -->
    <nav class="sidebar">
        <div class="sidebar-header">
            <a href="#" class="sidebar-brand">
                WAPP<span>TeamB</span>
            </a>
            <div class="sidebar-toggler not-active">
                <span></span>
                <span></span>
                <span></span>
            </div>
        </div>
        <div class="sidebar-body">
            <ul class="nav">

                <li class="nav-item">
                    <a href="/admin/home" class="nav-link">
                        <i class="link-icon" data-feather="box"></i>
                        <span class="link-title">HOME</span>
                    </a>
                </li>

                <li class="nav-item nav-category">MANAGE</li>

                <li class="nav-item">
                    <a class="nav-link" href="/admin/lecture-form.do">
                        <i class="link-icon" data-feather="feather"></i>
                        <span class="link-title">강의 관리</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/lecture-data-table.do">
                        <i class="link-icon" data-feather="anchor"></i>
                        <span class="link-title">강의 열람</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/banner-form.do">
                        <i class="link-icon" data-feather="inbox"></i>
                        <span class="link-title">배너 관리</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/banner-data-table.do">
                        <i class="link-icon" data-feather="layout"></i>
                        <span class="link-title">배너 열람</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/">
                        <i class="link-icon" data-feather="log-out"></i>
                        <span class="link-title">로그아웃</span>
                    </a>
                </li>



            </ul>
        </div>
    </nav>
    <nav class="settings-sidebar">
        <div class="sidebar-body">
            <a href="#" class="settings-sidebar-toggler">
                <i data-feather="settings"></i>
            </a>
            <h6 class="text-muted">Sidebar:</h6>
            <div class="form-group border-bottom">
                <div class="form-check form-check-inline">
                    <label class="form-check-label">
                        <input type="radio" class="form-check-input" name="sidebarThemeSettings" id="sidebarLight" value="sidebar-light" checked>
                        Light
                    </label>
                </div>
                <div class="form-check form-check-inline">
                    <label class="form-check-label">
                        <input type="radio" class="form-check-input" name="sidebarThemeSettings" id="sidebarDark" value="sidebar-dark">
                        Dark
                    </label>
                </div>
            </div>
            <div class="theme-wrapper">
                <h6 class="text-muted mb-2">Light Theme:</h6>
                <a class="theme-item active" href="demo_1/dashboard-one.html">
                    <img src="assets/images/screenshots/light.jpg" alt="light theme">
                </a>
                <h6 class="text-muted mb-2">Dark Theme:</h6>
                <a class="theme-item" href="demo_2/dashboard-one.html">
                    <img src="assets/images/screenshots/dark.jpg" alt="light theme">
                </a>
            </div>
        </div>
    </nav>
    <!-- partial -->

    <div class="page-wrapper">

        <!-- partial:../../partials/_navbar.html -->
        <nav class="navbar">
            <a href="#" class="sidebar-toggler">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-menu"><line x1="3" y1="12" x2="21" y2="12"></line><line x1="3" y1="6" x2="21" y2="6"></line><line x1="3" y1="18" x2="21" y2="18"></line></svg>
            </a>
            <div class="navbar-content">
                <form class="search-form">
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <div class="input-group-text">
                                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-database"><ellipse cx="12" cy="5" rx="9" ry="3"></ellipse><path d="M21 12c0 1.66-4 3-9 3s-9-1.34-9-3"></path><path d="M3 5v14c0 1.66 4 3 9 3s9-1.34 9-3V5"></path></svg>
                                <input type="text" class="form-control" id="navbarForm" value="관리자 페이지">
                            </div>
                        </div>

                    </div>
                </form>
                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="languageDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="flag-icon flag-icon-kr mt-1" title="kr"></i> <span class="font-weight-medium ml-1 mr-1">Korea</span>
                        </a>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- partial -->

        <div class="page-content">

            <nav class="page-breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="#">Lectures</a></li>
                </ol>
            </nav>

            <div class="row">
                <div class="col-md-12 grid-margin stretch-card">
                    <div class="card">
                        <div class="card-body">
                            <h6 class="card-title">Lecture Table</h6>
                            <div class="table-responsive">
                                <table id="dataTableExample" class="table">
                                    <thead>
                                    <tr>
                                        <th>No</th>
                                        <th>카테고리</th>
                                        <th>이름</th>
                                        <th>가격</th>
                                        <th>등록 날짜</th>
                                        <th>이미지</th>
                                        <th>Edit</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:set var="lectureList" value="${lectureList}"/>
                                    <c:forEach var="i" begin = "1" end = "${lectureList.size()}">
                                        <tr>
                                            <td>${i}</td>
                                            <td>${lectureList[i-1].lecCategory}</td>
                                            <td>${lectureList[i-1].lecName}</td>
                                            <td style="text-align: right"><fmt:formatNumber value="${lectureList[i-1].lecPrice}" type="currency" currencySymbol="" />원</td>
                                            <td><fmt:formatDate value="${lectureList[i-1].lecRegDate}" pattern="yyyy-MM-dd" /></td>
                                            <c:choose>
                                            <c:when test="${empty lectureList[i-1].lecImg}">
                                                <td>이미지 없음</td>
                                            </c:when>
                                            <c:otherwise>
                                                <td><button class="btn btn-primary" onclick="window.open('${lectureList[i-1].lecImg}')">이미지 보기</button></td>
                                            </c:otherwise>
                                            </c:choose>
                                            <td>
                                                <div class="btn-group" role="group" aria-label="Basic example">
                                                <button class="btn btn-primary" onclick="location.href='/admin/lecture-edit.do?lecNo=${lectureList[i-1].lecNo}'">수정</button>
                                                <button class="btn btn-secondary" onclick="if(confirm('정말 삭제하시겠습니까?')){location.href='/admin/lecture-delete.do?lecNo=${lectureList[i-1].lecNo}';} else {return false;}">삭제</button>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

        <!-- partial:../../partials/_footer.html -->
        <footer class="footer d-flex flex-column flex-md-row align-items-center justify-content-between">
            <p class="text-muted text-center text-md-left">Copyright © 2020 <a href="https://www.nobleui.com"
                                                                               target="_blank">NobleUI</a>. All rights
                reserved</p>
            <p class="text-muted text-center text-md-left mb-0 d-none d-md-block">Handcrafted With <i
                    class="mb-1 text-primary ml-1 icon-small" data-feather="heart"></i></p>
        </footer>
        <!-- partial -->

    </div>
</div>

<!-- core:js -->
<script src="../../../assets/vendors/core/core.js"></script>
<!-- endinject -->
<!-- plugin js for this page -->
<script src="../../../assets/vendors/datatables.net/jquery.dataTables.js"></script>
<script src="../../../assets/vendors/datatables.net-bs4/dataTables.bootstrap4.js"></script>
<!-- end plugin js for this page -->
<!-- inject:js -->
<script src="../../../assets/vendors/feather-icons/feather.min.js"></script>
<script src="../../../assets/js/template.js"></script>
<!-- endinject -->
<!-- custom js for this page -->
<script src="../../../assets/js/data-table.js"></script>
<!-- end custom js for this page -->
</body>
</html>