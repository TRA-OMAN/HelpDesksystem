/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLogicLayer;

import BusinessObjectLayer.Employee;
import DAL.EmployeeFactory;

/**
 *
 * @author loay.alsubhi
 */
public class EmployeeBLL {

    public EmployeeBLL() {
    }
    
    EmployeeFactory empf = new EmployeeFactory(); // connect
    
    public void EmpInsert(String email,String password){
        empf.Add(email,password);
    }
    
    public Employee login(String email,String password){
        return empf.Login(email, password);
    }
    
    
    
    
}
