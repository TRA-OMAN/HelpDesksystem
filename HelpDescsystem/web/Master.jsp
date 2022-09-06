<%-- 
    Document   : Master
    Created on : Jul 26, 2022, 12:40:44 PM
    Author     : loay.alsubhi
--%>

<%@page import="BusinessObjectLayer.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>

<link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<script src="js/jquery-3.6.0.min.js" type="text/javascript"></script>
<script src="js/bootstrap.js" type="text/javascript"></script>

<div class="container">
    <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
        <a href="/" class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none">
            <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"></use></svg>
        </a>

        <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
            <li><a href="#" class="nav-link px-2 link-secondary">Home</a></li>
            <li><a href="#" class="nav-link px-2 link-dark">Features</a></li>
            <li><a href="#" class="nav-link px-2 link-dark">Pricing</a></li>
            <li><a href="#" class="nav-link px-2 link-dark">FAQs</a></li>
            <li><a href="#" class="nav-link px-2 link-dark">About</a></li>
            <t:if test="${sessionScope.ses_emp != null}">
                <li><a href="list" class="nav-link px-2 link-dark">Manage Requests</a></li>
            
            </t:if>
        </ul>

        <div class="col-md-3 text-end">
            <t:if test="${sessionScope.ses_emp == null}">
                <a href="Master.jsp?p=login" class="btn btn-outline-primary me-2">Login</a>
                <a href="Master.jsp?p=regester" data-bs-toggle="modal" data-bs-target="#exampleModal" class="btn btn-primary">Sign-up</a>
            </t:if>

            <t:if test="${sessionScope.ses_emp != null}">

                <% HttpSession ses_emp = request.getSession();
                    String email = ((Employee)ses_emp.getAttribute("ses_emp")).getEmail();
                    if (request.getParameter("logout") != null) {
                        ses_emp.removeAttribute("ses_emp");
                        response.sendRedirect("Master.jsp?p=login");
                    }
                %>
                
                <a href="Master.jsp?p=account" class="btn btn-outline-primary me-2">Hello,<%=email%></a>
                <a href="Master.jsp?logout=out"   class="btn btn-primary">Logout</a>
            </t:if>   
        </div>

    </header>
</div>
<div class="container">

    <t:if test="${param.p eq 'login'}">
        <t:import url="login.jsp"/>
    </t:if>
    <t:if test="${param.p eq 'regester'}">
        <t:import url="regester.jsp"/>
    </t:if>
    <t:if test="${param.p eq 'account'}">
        <t:import url="Account.jsp"/>
    </t:if>
    <t:if test="${param.p eq 'admin'}">
        <t:import url="Admin.jsp"/>
    </t:if>
</div>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content rounded-5 shadow">
            <div class="modal-header p-5 pb-4 border-bottom-0">
                <!-- <h5 class="modal-title">Modal title</h5> -->
                <h2 class="fw-bold mb-0">Sign up for free</h2>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>

            <div class="modal-body p-5 pt-0">
                <form class="" method="post" action="EmployeeServlet">
                    <div class="form-floating mb-3">
                        <input type="email"  name="Email" class="form-control rounded-4" id="floatingInput" placeholder="name@example.com">
                        <label for="floatingInput">Email address</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input type="password" name="Password" class="form-control rounded-4" id="floatingPassword" placeholder="Password">
                        <label for="floatingPassword">Password</label>
                    </div>
                    <button class="w-100 mb-2 btn btn-lg rounded-4 btn-primary" name="signup" value="signup" type="submit">Sign up</button>
                    <small class="text-muted">By clicking Sign up, you agree to the terms of use.</small>

                </form>
            </div>
        </div>
    </div>
</div>