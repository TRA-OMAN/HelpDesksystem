<%-- 
    Document   : RequestForwardForm
    Created on : Aug 3, 2022, 12:21:43 PM
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


        
<t:if test="${req!=null}">
    <h2> Forward Request</h2>
    <form class="row g-3" action="update">
        <input type="hidden" name="id" value="${req.ID}"/>
        <input type="hidden" name="status" id="status" value="Forwarded.."/>
</t:if>
        
  <div class="col-md-6">
    <label for="txtTitle" class="form-label">Title</label>
    <input type="text"  required id="txtTitle" class="form-control" name="title" value="${req.title}" >
  </div>
  <div class="col-md-6">
    <label for="txtDetails" class="form-label">Details</label>
    <input type="text" required id="txtDetails" class="form-control" name="details" value="${req.details}" >
  </div>
  <div class="col-12">
    <label for="txtDate" class="form-label">Date</label>
    <input type="date"  required id="txtDate" class="form-control" name="RDate" value="${req.RDate}" >
  </div>
    <%-- <div class="col-12">
    <label for="ddlStatus" class="form-label">Status</label>
    <select id="ddlStatus"  name="status" class="form-select">
        <option value="null"> - select -</option>
        <option value="Init">Init</option>
        <option value="InProgress">InProgress</option>
        <option value="Complete">Complete</option>
        <option value="null">Reject</option>
        
    </select>
  </div> --%>
    
    <div class="col-12">
        <label>Reject OR Accept</label>
        <input type="radio" name="status" value="Accept"/>Accept
        <input type="radio" name="status" value="Reject"/>Reject
    </div>
    <script>
        $(function(){
            $("input[type=radio]").change(function()){
                $("#status").val($(this).val());
                $("#ddlRoles").attr("disabled","");
                if ($(this).val() === "Reject"){
                  $("#roleid").val(1);  
                }
                 $('#roleid').val(1);
            });
        });
    </script>
    
    <input type="hidden" value="${req.roleid}" name="roleid" id="roleid" />
    
     <div class="col-12">
    <label for="ddlRoles" class="form-label">Sections</label>
    <select id="ddlRoles"  name="roleid" class="form-select">
        <option value="1"> - select -</option>
        <option value="2">Network</option>
        <option value="3">Security</option>
        <option value="4">App</option>
        <option value="5">Finance</option>
        <option value="6">Manager</option>
        
    </select>
  </div> 
    
   
  
 
  <div class="col-12">
    <button type="submit" class="btn btn-primary">
        Forward to Section
    </button>
  </div>
</form>
</div>
