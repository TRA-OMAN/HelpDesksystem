/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package BusinessLogicLayer;

import BusinessObjectLayer.Employee;
import BusinessObjectLayer.RequestHD;
import DAL.RequestFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "RequestServlet", urlPatterns = {"/"})
public class RequestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;     //standered statement to call static function   
    private RequestFactory requestFactory;

    @Override
    public void init() {
        requestFactory = new RequestFactory();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/createnew":
                    fn_NewEmptyForm(request, response);
                    break;
                case "/insert":
                    fn_insertRequest(request, response);
                    break;
                case "/list":
                    fn_listRequest(request, response);
                    break;
                case "/edit":
                    fn_EditForm(request, response);
                    break;
                case "/update":
                    fn_updateRequest(request, response);
                    break;
                case "/delete":
                    fn_deleteRequest(request, response);
                    break;
                case "/forward":
                    fn_ForwardForm(request, response);
                    break;    
                default:
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void fn_NewEmptyForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("RequestForm.jsp");
        dispatcher.forward(request, response);
    }

    private void fn_insertRequest(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

        try {
            HttpSession sees_emp = request.getSession();
            java.util.Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("RDate"));

            String title = request.getParameter("title");
            String details = request.getParameter("details");
            String status = request.getParameter("status");
            int employeeid = ((Employee) sees_emp.getAttribute("ses_emp")).getID();
            Date rdate = new Date(dt.getTime());
            RequestHD Req = new RequestHD(title, details, rdate, status, employeeid);
            requestFactory.addRequest(Req);
            response.sendRedirect("list");
        } catch (ParseException ex) {
            Logger.getLogger(RequestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void fn_listRequest(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        HttpSession ses_emp = request.getSession();
        List<RequestHD> listallRequest;
        
        if( ses_emp.getAttribute("ses_emp") != null ){
            Employee emp = ((Employee) ses_emp.getAttribute("ses_emp"));
            if (emp.getRoleid() == 7 ){
            listallRequest = requestFactory.getEmployeeRequest(emp.getID());
            }else if(emp.getRoleid() !=1){
            listallRequest = requestFactory.getallRequestsByRole(emp.getRoleid());
            }
            else {
                listallRequest = requestFactory.getallRequest();
            }
            request.setAttribute("listallRequest", listallRequest);
            request.setAttribute("roleid", emp.getRoleid());
            RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayRequest.jsp");
            dispatcher.forward(request, response);
        }
        
        

    }

    private void fn_EditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestHD req = requestFactory.getoneRequest(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("RequestForm.jsp");
        request.setAttribute("req", req);
        dispatcher.forward(request, response);

    }
    
    private void fn_ForwardForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestHD req = requestFactory.getoneRequest(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("RequestForwardForm.jsp");
        request.setAttribute("req", req);
        dispatcher.forward(request, response);

    }

    private void fn_updateRequest(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            int roleid = Integer.parseInt(request.getParameter("roleid"));
            
            java.util.Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("RDate"));
            Date rdate = new Date(dt.getTime());
            String title = request.getParameter("title");
            String details = request.getParameter("details");
            String status = request.getParameter("status");

            RequestHD Req = new RequestHD(id, title, details, rdate, status,roleid);
            requestFactory.updateRequest(Req);
            response.sendRedirect("list");

        } catch (ParseException ex) {
            Logger.getLogger(RequestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void fn_deleteRequest(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

        int id = Integer.parseInt(request.getParameter("id"));
        requestFactory.deleteRequest(id);
        response.sendRedirect("list");
    }
    
    

}
