package com.fatec.neweducation.model;
// Generated 23/08/2014 14:33:20 by Hibernate Tools 3.6.0



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer id;
     private String nameUser;
     private Integer typeUser;
     private String loginUser;
     private String password;

    public User() {
    }

    public User(String nameUser, Integer typeUser, String loginUser, String password) {
       this.nameUser = nameUser;
       this.typeUser = typeUser;
       this.loginUser = loginUser;
       this.password = password;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNameUser() {
        return this.nameUser;
    }
    
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    public Integer getTypeUser() {
        return this.typeUser;
    }
    
    public void setTypeUser(Integer typeUser) {
        this.typeUser = typeUser;
    }
    public String getLoginUser() {
        return this.loginUser;
    }
    
    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}

