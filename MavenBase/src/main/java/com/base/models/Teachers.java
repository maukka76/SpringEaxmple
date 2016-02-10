package com.base.models;
// Generated 10.2.2016 12:49:08 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Teachers generated by hbm2java
 */
public class Teachers  implements java.io.Serializable {


     private Integer id;
     private String TName;
     private String email;
     private String phone;
     private String TSubject;
     private Set relTables = new HashSet(0);

    public Teachers() {
    }

	
    public Teachers(String TName) {
        this.TName = TName;
    }
    public Teachers(String TName, String email, String phone, String TSubject, Set relTables) {
       this.TName = TName;
       this.email = email;
       this.phone = phone;
       this.TSubject = TSubject;
       this.relTables = relTables;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTName() {
        return this.TName;
    }
    
    public void setTName(String TName) {
        this.TName = TName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getTSubject() {
        return this.TSubject;
    }
    
    public void setTSubject(String TSubject) {
        this.TSubject = TSubject;
    }
    public Set getRelTables() {
        return this.relTables;
    }
    
    public void setRelTables(Set relTables) {
        this.relTables = relTables;
    }




}

