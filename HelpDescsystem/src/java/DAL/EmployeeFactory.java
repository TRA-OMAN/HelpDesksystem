/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BusinessObjectLayer.Employee;
import BusinessObjectLayer.IEmployee;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author loay.alsubhi
 */
public class EmployeeFactory implements IEmployee {

    String url = "jdbc:sqlserver://localhost\\sqlexpress:1433;databaseName=tra_pmsdb;encrypt=false;integratedSecurity=false";
    
    private String user = "sa";
    private String password = "123";
    private Connection con;

    public EmployeeFactory() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url,user,password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee Login(String email, String password) {
        Employee emp = null;
        try {
            
            CallableStatement st = con.prepareCall("{call dbo.sp_emplogin(?,?)}");
            st.setString(1, email);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                emp = new Employee(rs.getInt("ID"),rs.getString("Email"),
                        rs.getString("Password"),rs.getInt("RoleID"),rs.getString("Name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }

    @Override
    public void Add(String email, String password) {

        try {

            CallableStatement st = con.prepareCall("{call dbo.sp_AddEmp(?,?)}");
            st.setString(1, email);
            st.setString(2, password);
            st.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Update(int id, Employee emp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Employee getEmp(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
