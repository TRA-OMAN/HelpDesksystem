<%-- 
    Document   : RequestForm
    Created on : Aug 1, 2022, 1:29:55 PM
    Author     : loay.alsubhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
<script src="js/jquery-3.6.0.min.js" type="text/javascript"></script>
<script src="js/bootstrap.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<div class="container">

<t:if test="${req==null}">
    <h2> Insert New Request</h2>
        
    <form class="row g-3" action="insert">
</t:if>
        
<t:if test="${req!=null}">
    <h2> Edit Request</h2>
    <form class="row g-3" action="update">
        <input type="hidden" name="id" value="${req.ID}"/>
        <input type="hidden" name="roleid" value="${req.roleid}"/>
</t:if>
        
  <div class="col-md-6">
    <label for="txtTitle" class="form-label">Title</label>
    <input type="text" required id="txtTitle" class="form-control" name="title" value="${req.title}" >
  </div>
  <div class="col-md-6">
    <label for="txtDetails" class="form-label">Details</label>
    <input type="text"  required id="txtDetails" class="form-control" name="details" value="${req.details}" >
  </div>
  <div class="col-12">
    <label for="txtDate" class="form-label">Date</label>
    <input type="date"  required id="txtDate" class="form-control" name="RDate" value="${req.RDate}" >
  </div>
  <div class="col-12">
    <label for="ddlStatus" class="form-label">Status</label>
    <select id="ddlStatus"  name="status" class="form-select">
        <option value="null"> - select -</option>
        <option value="Init">Init</option>
        <option value="InProgress">InProgress</option>
        <option value="Complete">Complete</option>
        
    </select>
  </div>
    <t:if test="${req.status !=null}">
        <script>
            $(function(){
                $("#ddlStatus option:contains(${req.status})").attr('selected','selected');
            });
        </script>
    </t:if>
  
 
  <div class="col-12">
    <button type="submit" class="btn btn-primary">
        Save Request
    </button>
  </div>
</form>
</div>
