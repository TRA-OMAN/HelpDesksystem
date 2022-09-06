/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BusinessObjectLayer;

/**
 *
 * @author loay.alsubhi
 */
public interface IEmployee {
     Employee Login(String email,String password);
     
     void Add(String email,String password);
     void Update(int id, Employee emp);
     Employee getEmp(int id);
     
     
     
}
