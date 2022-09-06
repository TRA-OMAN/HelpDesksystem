/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessObjectLayer;

import java.sql.Date;

/**
 *
 * @author loay.alsubhi
 */
public class RequestHD {
    private int ID;
    private String Title;
    private String Details;
    private Date RDate;
    private String Status;
    private int Emloyeeid;
    private int roleid;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }
    
    

    public int getEmloyeeid() {
        return Emloyeeid;
    }

    public void setEmloyeeid(int Emloyeeid) {
        this.Emloyeeid = Emloyeeid;
    }
    
    
    public String getStatus(){
        return Status;
    }

    public RequestHD(int ID, String Title, String Details, Date RDate, String Status,int roleid) {
        this.ID = ID;
        this.Title = Title;
        this.Details = Details;
        this.RDate = RDate;
        this.Status = Status;
        this.roleid = roleid;
    }
    
     public RequestHD(int ID, String Title, String Details, Date RDate, String Status) {
        this.ID = ID;
        this.Title = Title;
        this.Details = Details;
        this.RDate = RDate;
        this.Status = Status;
        
    }

    public RequestHD(String Title, String Details, Date RDate, String Status,int employeeid) {
        this.Title = Title;
        this.Details = Details;
        this.RDate = RDate;
        this.Status = Status;
        this.Emloyeeid = employeeid;
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }

    public Date getRDate() {
        return RDate;
    }

    public void setRDate(Date RDate) {
        this.RDate = RDate;
    }

    
    
    
}
