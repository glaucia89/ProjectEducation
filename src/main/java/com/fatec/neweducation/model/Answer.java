package com.fatec.neweducation.model;
// Generated 23/08/2014 14:33:20 by Hibernate Tools 3.6.0



/**
 * Answer generated by hbm2java
 */
public class Answer  implements java.io.Serializable {


     private Integer id;
     private String typeAnswer;
     private String response;
     private String picture;
     private String audio;
     private Boolean isCorrect;
     private Integer fkQuestion;

    public Answer() {
    }

    public Answer(String typeAnswer, String response, String picture, String audio, Boolean isCorrect, Integer fkQuestion) {
       this.typeAnswer = typeAnswer;
       this.response = response;
       this.picture = picture;
       this.audio = audio;
       this.isCorrect = isCorrect;
       this.fkQuestion = fkQuestion;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTypeAnswer() {
        return this.typeAnswer;
    }
    
    public void setTypeAnswer(String typeAnswer) {
        this.typeAnswer = typeAnswer;
    }
    public String getResponse() {
        return this.response;
    }
    
    public void setResponse(String response) {
        this.response = response;
    }
    public String getPicture() {
        return this.picture;
    }
    
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getAudio() {
        return this.audio;
    }
    
    public void setAudio(String audio) {
        this.audio = audio;
    }
    public Boolean getIsCorrect() {
        return this.isCorrect;
    }
    
    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
    public Integer getFkQuestion() {
        return this.fkQuestion;
    }
    
    public void setFkQuestion(Integer fkQuestion) {
        this.fkQuestion = fkQuestion;
    }




}


