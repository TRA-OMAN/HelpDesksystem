/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessObjectLayer;

/**
 *
 * @author loay.alsubhi
 */
public class Employee {
    private int ID;
    private String Email;
    private String Password;
    private int roleid;
    private String rolename;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }
    
     public Employee(){
     
     
     }
    

    public Employee(int ID, String Email, String Password,int roleid,String rolename) {
        this.ID = ID;
        this.Email = Email;
        this.Password = Password;
        this.roleid = roleid;
        this.rolename = rolename;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
