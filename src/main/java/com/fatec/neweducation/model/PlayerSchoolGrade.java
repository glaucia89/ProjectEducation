package com.fatec.neweducation.model;
// Generated 23/08/2014 14:33:20 by Hibernate Tools 3.6.0



/**
 * PlayerSchoolGrade generated by hbm2java
 */
public class PlayerSchoolGrade  implements java.io.Serializable {


     private Integer id;
     private Integer yearClasse;
     private Integer classe;
     private Integer fkPlayer;
     private Integer fkSchool;

    public PlayerSchoolGrade() {
    }

    public PlayerSchoolGrade(Integer yearClasse, Integer classe, Integer fkPlayer, Integer fkSchool) {
       this.yearClasse = yearClasse;
       this.classe = classe;
       this.fkPlayer = fkPlayer;
       this.fkSchool = fkSchool;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getYearClasse() {
        return this.yearClasse;
    }
    
    public void setYearClasse(Integer yearClasse) {
        this.yearClasse = yearClasse;
    }
    public Integer getClasse() {
        return this.classe;
    }
    
    public void setClasse(Integer classe) {
        this.classe = classe;
    }
    public Integer getFkPlayer() {
        return this.fkPlayer;
    }
    
    public void setFkPlayer(Integer fkPlayer) {
        this.fkPlayer = fkPlayer;
    }
    public Integer getFkSchool() {
        return this.fkSchool;
    }
    
    public void setFkSchool(Integer fkSchool) {
        this.fkSchool = fkSchool;
    }




}


