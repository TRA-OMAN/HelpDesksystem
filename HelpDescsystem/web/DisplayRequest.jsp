<%-- 
    Document   : DisplayRequest
    Created on : Aug 2, 2022, 9:32:52 AM
    Author     : loay.alsubhi
--%>

<%@page import="BusinessObjectLayer.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <center>
                <h1>Requests Management</h1>
                <h2>
                    <a href="createnew" class="btn btn-link">Create Request</a>
                    <a href="list" class="btn btn-link">Display Request</a>
                </h2>
            </center> 
            <% 
            HttpSession ses_emp = request.getSession();
            Employee emp = (Employee)ses_emp.getAttribute("ses_emp");
            int id = emp.getID();
            String email = emp.getEmail();
            String rolename = emp.getRolename();
            
            %>
            <h3> #<%=id%>,<%=email%> : <%=rolename%></h3>
            <div align="center">
                <table class="table">
                    <caption><h2>List of Requests</h2></caption>
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Details</th>
                        <th>Date</th>
                        <th>Status</th>
                        <th></th>
                    </tr>
                    
                    <t:forEach var="req" items="${listallRequest}">
                        <tr>
                            <td>${req.ID}</td>
                            <td>${req.title}</td>
                            <td>${req.details}</td>
                            <td>${req.RDate}</td>
                            <t:choose>
                                <t:when test="${req.status == 'Init'}">
                                    <td class="bg-info text-dark">${req.status}</td>
                                </t:when>
                                <t:when test="${req.status == 'InProgress'}">
                                    <td class="bg-warning text-dark">${req.status}</td>
                                </t:when>
                                <t:when test="${req.status == 'Complete'}">
                                    <td class="bg-success text-dark">${req.status}</td>
                                </t:when>
                                <t:when test="${req.status == 'Forwarded..'}">
                                    <td class="bg-primary text-white">Forwarded..</td>
                                </t:when>
                                <t:when test="${req.status == 'Reject'}">
                                    <td class="bg-danger text-white">Rejected</td>
                                </t:when>
                                <t:otherwise>
                                    
                                    <td class="bg-dark text-white">Accepted & Init</td>
                               
                                </t:otherwise>
                                
                            </t:choose>    
                            
                            <td>
                                <t:if test="${roleid==1}">
                                  
                                <a href="edit?id=${req.ID}">Edit</a>
                                <a href="forward?id=${req.ID}">Forward</a>
                                <a onclick="javascript:confirm('Are You Sure')"  href="delete?id=${req.ID}">Delete</a>
                                </t:if>
                                
                                <t:if test="${roleid !=1 && roleid !=7}">
                                    <a href ="forward?id=${req.ID}">Reject</a>
                                </t:if>
                            </td>
                        </tr>
                        
                    </t:forEach>
                </table>
                
            </div>
        </div>
    </body>
</html>
