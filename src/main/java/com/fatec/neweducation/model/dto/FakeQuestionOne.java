package com.fatec.neweducation.model.dto;

import com.fatec.neweducation.model.Answer;
import com.fatec.neweducation.model.Question;
import com.fatec.neweducation.model.resources.Hability;
import com.fatec.neweducation.model.resources.TypeAnswer;
import com.fatec.neweducation.model.resources.TypeQuestion;

/**
 * Created by glaucia on 12/08/14.
 * FAE 1 /2
 * <p/>
 * Questão com 3 alternativas do tipo imagem
 */
public class FakeQuestionOne {

    private Integer idQuestion;
    private Integer idAnswerA;
    private Integer idAnswerB;
    private Integer idAnswerC;
    private String pictureA;
    private String pictureB;
    private String pictureC;
    private Boolean isCorrectA;
    private Boolean isCorrectB;
    private Boolean isCorrectC;
    private String asking;
    private Hability hability;
    private Integer dificulty;
    private TypeQuestion typeQuestion;
    private TypeAnswer typeAnswer;

    public FakeQuestionOne(Integer idQuestion, Integer idAnswerA, Integer idAnswerB, Integer idAnswerC, String pictureA, String pictureB, String pictureC, Boolean isCorrectA, Boolean isCorrectB, Boolean isCorrectC, String asking, Hability hability, Integer dificulty, TypeQuestion typeQuestion, TypeAnswer typeAnswer) {
        this.idQuestion = idQuestion;
        this.idAnswerA = idAnswerA;
        this.idAnswerB = idAnswerB;
        this.idAnswerC = idAnswerC;
        this.pictureA = pictureA;
        this.pictureB = pictureB;
        this.pictureC = pictureC;
        this.isCorrectA = isCorrectA;
        this.isCorrectB = isCorrectB;
        this.isCorrectC = isCorrectC;
        this.asking = asking;
        this.hability = hability;
        this.dificulty = dificulty;
        this.typeQuestion = typeQuestion;
        this.typeAnswer = typeAnswer;
    }

    public FakeQuestionOne(String pictureA, String pictureB, String pictureC, Boolean isCorrectA, Boolean isCorrectB, Boolean isCorrectC, String asking, Hability hability, Integer dificulty, TypeQuestion typeQuestion, TypeAnswer typeAnswer) {
        this.pictureA = pictureA;
        this.pictureB = pictureB;
        this.pictureC = pictureC;
        this.isCorrectA = isCorrectA;
        this.isCorrectB = isCorrectB;
        this.isCorrectC = isCorrectC;
        this.asking = asking;
        this.hability = hability;
        this.dificulty = dificulty;
        this.typeQuestion = typeQuestion;
        this.typeAnswer = typeAnswer;
    }

    public FakeQuestionOne() {
    }



    public Integer getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Integer idQuestion) {
        this.idQuestion = idQuestion;
    }

    public Integer getIdAnswerA() {
        return idAnswerA;
    }

    public void setIdAnswerA(Integer idAnswerA) {
        this.idAnswerA = idAnswerA;
    }

    public Integer getIdAnswerB() {
        return idAnswerB;
    }

    public void setIdAnswerB(Integer idAnswerB) {
        this.idAnswerB = idAnswerB;
    }

    public Integer getIdAnswerC() {
        return idAnswerC;
    }

    public void setIdAnswerC(Integer idAnswerC) {
        this.idAnswerC = idAnswerC;
    }

    public String getPictureA() {
        return pictureA;
    }

    public void setPictureA(String pictureA) {
        this.pictureA = pictureA;
    }

    public String getPictureB() {
        return pictureB;
    }

    public void setPictureB(String pictureB) {
        this.pictureB = pictureB;
    }

    public String getPictureC() {
        return pictureC;
    }

    public void setPictureC(String pictureC) {
        this.pictureC = pictureC;
    }

    public Boolean getIsCorrectA() {
        return isCorrectA;
    }

    public void setIsCorrectA(Boolean isCorrectA) {
        this.isCorrectA = isCorrectA;
    }

    public Boolean getIsCorrectB() {
        return isCorrectB;
    }

    public void setIsCorrectB(Boolean isCorrectB) {
        this.isCorrectB = isCorrectB;
    }

    public Boolean getIsCorrectC() {
        return isCorrectC;
    }

    public void setIsCorrectC(Boolean isCorrectC) {
        this.isCorrectC = isCorrectC;
    }

    public String getAsking() {
        return asking;
    }

    public void setAsking(String asking) {
        this.asking = asking;
    }

    public Hability getHability() {
        return hability;
    }

    public void setHability(Hability hability) {
        this.hability = hability;
    }

    public TypeQuestion getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(TypeQuestion typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

    public TypeAnswer getTypeAnswer() {
        return typeAnswer;
    }

    public void setTypeAnswer(TypeAnswer typeAnswer) {
        this.typeAnswer = typeAnswer;
    }

    public Question getQuestion() {
        Question question = new Question();

        if (idQuestion != null) {
            question.setId(this.getIdQuestion());
        }

        if (asking != null) {
            question.setAsking(this.getAsking());
        }

        if (hability != null) {
            question.setHability(this.getHability());
        }

        if (typeQuestion != null) {
            question.setTypeQuestion(this.getTypeQuestion());
        }

        return question;
    }

    public Answer getAnswerA() {

        Answer answer = new Answer();

        answer.setFkQuestion(this.getQuestion());

        if (idAnswerA != null) {
            answer.setId(this.getIdAnswerA());
        }

        if (typeAnswer != null) {
            answer.setTypeAnswer(this.getTypeAnswer());
        }

        if (pictureA != null) {
            answer.setPicture(this.getPictureA());
        }

        if (isCorrectA != null) {
            answer.setIsCorrect(this.getIsCorrectA());
        }

        return answer;
    }

    public Answer getAnswerB() {

        Answer answer = new Answer();

        answer.setFkQuestion(this.getQuestion());

        if (idAnswerB != null) {
            answer.setId(this.getIdAnswerB());
        }

        if (typeAnswer != null) {
            answer.setTypeAnswer(this.getTypeAnswer());
        }

        if (pictureB != null) {
            answer.setPicture(this.getPictureB());
        }

        if (isCorrectB != null) {
            answer.setIsCorrect(this.getIsCorrectB());
        }

        return answer;
    }

    public Answer getAnswerC() {

        Answer answer = new Answer();

        answer.setFkQuestion(this.getQuestion());

        if (idAnswerC != null) {
            answer.setId(this.getIdAnswerC());
        }

        if (typeAnswer != null) {
            answer.setTypeAnswer(this.getTypeAnswer());
        }

        if (pictureC != null) {
            answer.setPicture(this.getPictureC());
        }

        if (isCorrectC != null) {
            answer.setIsCorrect(this.getIsCorrectC());
        }

        return answer;
    }

    public Integer getDificulty() {
        return dificulty;
    }

    public void setDificulty(Integer dificulty) {
        this.dificulty = dificulty;
    }

}
