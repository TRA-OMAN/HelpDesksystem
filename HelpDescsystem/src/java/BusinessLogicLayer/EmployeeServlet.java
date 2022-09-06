/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package BusinessLogicLayer;

import BusinessObjectLayer.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author loay.alsubhi
 */
@WebServlet(name = "EmployeeServlet", urlPatterns = {"/EmployeeServlet"})
public class EmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher rd;
        EmployeeBLL empbll = new EmployeeBLL();
        HttpSession ses_emp = request.getSession();
        if (request.getParameter("signin") != null) {
            Employee emp = empbll.login(request.getParameter("Email"), request.getParameter("Password"));
            if(emp != null){
            
                ses_emp.setAttribute("ses_emp", emp);
                
                if (emp.getRoleid()==1){
                rd = request.getRequestDispatcher("Master.jsp?p=admin");
                
                }else{
                 rd = request.getRequestDispatcher("Master.jsp?p=account&accountid=" + emp.getID());
                }}
            else{
                request.setAttribute("Error", "Try Again!");
                rd = request.getRequestDispatcher("Master.jsp?p=login");
            }
            rd.forward(request, response);
        }
        if (request.getParameter("signup") != null) {
            empbll.EmpInsert(request.getParameter("Email"), request.getParameter("Password"));
            response.sendRedirect("Master.jsp?p=login");
        }

        

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
