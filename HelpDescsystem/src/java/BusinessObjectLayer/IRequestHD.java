/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BusinessObjectLayer;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author loay.alsubhi
 */
public interface IRequestHD {
    boolean addRequest (RequestHD req)throws SQLException;
    boolean updateRequest(RequestHD req)throws SQLException;
    boolean deleteRequest(int id) throws SQLException;
    List<RequestHD> getallRequest() throws SQLException;
    List<RequestHD> getEmployeeRequest(int id) throws SQLException;
    RequestHD getoneRequest (int id) throws SQLException;
    void disconnect () throws SQLException;
    List<RequestHD> getallRequestsByRole(int roleid) throws SQLException;
}
