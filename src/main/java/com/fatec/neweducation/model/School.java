package com.fatec.neweducation.model;
// Generated 25/08/2014 21:45:35 by Hibernate Tools 3.6.0



/**
 * School generated by hbm2java
 */
public class School  implements java.io.Serializable {


     private Integer id;
     private String title;
     private String city;
     private String state;

    public School() {
    }

    public School(String title, String city, String state) {
       this.title = title;
       this.city = city;
       this.state = state;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }




}


