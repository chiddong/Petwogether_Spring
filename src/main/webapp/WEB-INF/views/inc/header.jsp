<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="wrap">
	<div class="container">
		<div class="row">
			<div class="col-md-6 d-flex align-items-center">
				<p class="mb-0 phone pl-md-2">
					<a href="#" class="mr-2"><i class="fa fa-phone mr-1"></i>
						02-3482-4632 </a> <a href="#"><i class="fa fa-paper-plane mr-1"></i>
						ssangyoung@email.com</a>
				</p>
			</div>
			<div class="col-md-6 d-flex justify-content-md-end">
				<div class="social-media">
					<p class="mb-0 d-flex">
						<a class="d-flex align-items-center justify-content-center"><i
							class="fa fa-facebook"><i class="sr-only">Facebook</i></i></a> <a
							class="d-flex align-items-center justify-content-center"><i
							class="fa fa-twitter"><i class="sr-only">Twitter</i></i></a> <a
							class="d-flex align-items-center justify-content-center"><i
							class="fa fa-instagram"><i class="sr-only">Instagram</i></i></a> <a
							class="d-flex align-items-center justify-content-center"><i
							class="fa fa-dribbble"><i class="sr-only">Dribbble</i></i></a>
					</p>
				</div>
			</div>
		</div>
	</div>
</div>
<nav
	class="navbar navbar-expand-lg navbar-dark ftco_navbar ftco-navbar-light"
	id="ftco-navbar">
	<div class="container">
		<a class="navbar-brand" href="/petwogether/main/index"><span
			class="flaticon-pawprint-1 mr-2" style="color: #F6BD5B;"></span><img
			src="<%=request.getContextPath()%>/resources/images/logo.png"
			style="width: 200px;"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#ftco-nav" aria-controls="ftco-nav"
			aria-expanded="false" aria-label="Toggle navigation">
			<i class="fa-solid fa-bars"></i> Menu
		</button>
		<div class="collapse navbar-collapse" id="ftco-nav">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">??????
						?????????</a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item"
							href="/petwogether/member/careserviceintro">?????? ????????? ??????</a></li>
						<li><a class="dropdown-item" href="/petwogether/member/psreviewlist">?????? ?????? ?????????</a></li>
					</ul></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">????????????
						??????</a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item" href="#">?????? ?????? ??????</a></li>
						<li><a class="dropdown-item" href="#">?????? ?????? ?????????</a></li>
					</ul></li>
				<li class="nav-item"><a href="services.html" class="nav-link">????????????
						??????</a></li>
				<li class="nav-item"><a href="gallery.html" class="nav-link">??????
						?????????</a></li>
				<li class="nav-item"><a href="pricing.html" class="nav-link">QnA
						?????????</a></li>
				<li class="nav-item"><a href="blog.html" class="nav-link">??????
						?????????</a></li>
				<c:if test="${empty auth}">
					<li class="nav-item"><a href="/petwogether/member/login"
						class="nav-link">?????????</a></li>
				</c:if>
				<c:if test="${not empty auth}">
					<li class="nav-item"><a href="/petwogether/member/logout"
						class="nav-link">????????????</a></li>
				</c:if>
			</ul>
		</div>
	</div>
</nav>