/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BusinessObjectLayer.IRequestHD;
import BusinessObjectLayer.RequestHD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author loay.alsubhi
 */
public class RequestFactory implements IRequestHD {

    String url = "jdbc:sqlserver://localhost\\sqlexpress:1433;databaseName=tra_pmsdb;encrypt=false;integratedSecurity=false";

    private String user = "sa";
    private String password = "123";
    private Connection con;

    public RequestFactory() {
        connect();
    }

    public void connect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addRequest(RequestHD req) throws SQLException {
        connect();
        CallableStatement st = con.prepareCall("{call dbo.sp_ManageRequest(?,?,?,?,?,?,?,?)}");
        st.setInt(1, 0);
        st.setString(2, req.getTitle());
        st.setString(3, req.getDetails());
        st.setDate(4, (Date) req.getRDate());
        st.setString(5, req.getStatus());
        st.setInt(6, req.getEmloyeeid());
        st.setInt(7, 7); // employee roleid 7
        st.setString(8, "insert");

        //PreparedStatement statement = con.prepareStatement(sql);
        boolean isAdded = st.executeUpdate() > 0;
        st.close();
        disconnect();
        return isAdded;
    }

    @Override
    public boolean updateRequest(RequestHD req) throws SQLException {
        connect();
        CallableStatement st = con.prepareCall("{call dbo.sp_ManageRequest(?,?,?,?,?,?,?,?)}");
        st.setInt(1, req.getID());
        st.setString(2, req.getTitle());
        st.setString(3, req.getDetails());
        st.setDate(4, (Date) req.getRDate());
        st.setString(5, req.getStatus());
        st.setInt(6, req.getEmloyeeid());
        st.setInt(7, req.getRoleid());
        st.setString(8, "update");

        boolean isUpdated = st.executeUpdate() > 0;
        st.close();
        disconnect();
        return isUpdated;
    }

    @Override
    public boolean deleteRequest(int id) throws SQLException {
        connect();
        CallableStatement st = con.prepareCall("{call dbo.sp_ManageRequest(?,?,?,?,?,?,?,?)}");

        st.setInt(1, id);
        st.setString(2, null);
        st.setString(3, null);
        st.setDate(4, null);
        st.setString(5, null);
        st.setInt(6, 0);
        st.setInt(7, 0);
        st.setString(8, "delete");

        boolean isDeleted = st.executeUpdate() > 0;
        st.close();
        disconnect();
        return isDeleted;
    }

     @Override
    public List<RequestHD> getallRequest() throws SQLException {
        connect();
        CallableStatement st = con.prepareCall("{call dbo.sp_getallRequest()}");
        List<RequestHD> LstRequestHD = new ArrayList<>();
       
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("ID");
            String title = rs.getString("Title");
            String details = rs.getString("Details");
            Date rdate = rs.getDate("RDate");
            String status = rs.getString("Status");
            

            RequestHD reqHD = new RequestHD(id, title, details, rdate, status);
            LstRequestHD.add(reqHD);
        }
        rs.close();
        st.close();
        disconnect();
        return LstRequestHD;
    }
    
    
    @Override
    public List<RequestHD> getallRequestsByRole(int roleid) throws SQLException {
        connect();
        CallableStatement st = con.prepareCall("{call dbo.sp_getallRequestsByRole(?)}");
        List<RequestHD> LstRequestHD = new ArrayList<>();
        st.setInt(1, roleid);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("ID");
            String title = rs.getString("Title");
            String details = rs.getString("Details");
            Date rdate = rs.getDate("RDate");
            String status = rs.getString("Status");
            

            RequestHD reqHD = new RequestHD(id, title, details, rdate, status);
            LstRequestHD.add(reqHD);
        }
        rs.close();
        st.close();
        disconnect();
        return LstRequestHD;
    }

    @Override
    public RequestHD getoneRequest(int id) throws SQLException {
        connect();
        RequestHD req = null;

        CallableStatement st = con.prepareCall("{call dbo.sp_ManageRequest(?,?,?,?,?,?,?,?)}");
        st.setInt(1, id);
        st.setString(2, null);
        st.setString(3, null);
        st.setDate(4, null);
        st.setString(5, null);
        st.setInt(6, 0);
        st.setInt(7, 0);
        st.setString(8, "getone");
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            req = new RequestHD(rs.getInt("ID"),
                    rs.getString("Title"),
                    rs.getString("Details"),
                    rs.getDate("RDate"),
                    rs.getString("Status"),
                    rs.getInt("RoleID")
            );

        }
        rs.close();
        st.close();
        disconnect();
        return req;
    }

    @Override
    public void disconnect() throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }

    @Override
    public List<RequestHD> getEmployeeRequest(int id) throws SQLException {
        connect();
        CallableStatement st = con.prepareCall("{call dbo.sp_getEmployeeRequest(?)}");
        List<RequestHD> LstRequestHD = new ArrayList<>();
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            id = rs.getInt("ID");
            String title = rs.getString("Title");
            String details = rs.getString("Details");
            Date rdate = rs.getDate("RDate");
            String status = rs.getString("Status");

            RequestHD reqHD = new RequestHD(id, title, details, rdate, status);
            LstRequestHD.add(reqHD);
        }
        rs.close();
        st.close();
        disconnect();
        return LstRequestHD;
    }

}
