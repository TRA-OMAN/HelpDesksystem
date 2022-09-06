<%-- 
    Document   : login
    Created on : Jul 26, 2022, 12:53:59 PM
    Author     : loay.alsubhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>

<t:if test="${sessionScope.ses_emp == null}">
    
<main class="form-signin">
  <form method="post" action="EmployeeServlet">
    <img class="mb-4" src="movie8.jpg" alt="" width="72" height="57">
    
    <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

    <div class="form-floating">
      <input type="email" name="Email" class="form-control" id="floatingInput" placeholder="name@example.com">
      <label for="floatingInput">Email address</label>
    </div>
    <div class="form-floating">
      <input type="password" name="Password" class="form-control" id="floatingPassword" placeholder="Password">
      <label for="floatingPassword">Password</label>
    </div>

    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> Remember me
      </label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" name="signin" value="signin" type="submit">Sign in</button>
    <h3 class="text text-danger"> <t:out value="${Error}"/></h3>
    <p class="mt-5 mb-3 text-muted">© 2017–2021</p>
  </form>
</main>
</t:if>

<t:if test="${sessionScope.ses_emp != null}">
    
    <% response.sendRedirect("Master.jsp?p=account");%>
</t:if>