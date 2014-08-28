package com.fatec.neweducation.model.dto;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.model.School;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.resources.Gender;
import com.fatec.neweducation.model.resources.TypeUser;
import java.util.Date;

/**
 * Created by glaucia on 12/08/14.
 */
public class FakeUserPlayer {

    private String name;
    private String login;
    private String password;
    private Date dateOfBirth;
    private Gender gender;
    private Integer year;
    private Integer classe;
    private School school;
    private Integer idUser;
    private Integer idPlayer;
    private Integer idPlayerSchoolGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Integer idPlayer) {
        this.idPlayer = idPlayer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) {
        this.classe = classe;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School idSchool) {
        this.school = idSchool;
    }

    public Integer getIdPlayerSchoolGrade() {
        return idPlayerSchoolGrade;
    }

    public void setIdPlayerSchoolGrade(Integer idPlayerSchoolGrade) {
        this.idPlayerSchoolGrade = idPlayerSchoolGrade;
    }

    public User getUser() {
        User user = new User();
        user.setTypeUser(TypeUser.USUARIO);

        if (idUser != null) {
            user.setId(this.getIdUser());
        }

        if (name != null) {
            user.setNameUser(this.getName());
        }

        if (login != null) {
            user.setLoginUser(this.getLogin());
        }

        if (password != null) {
            user.setPassword(this.getPassword());
        }

        return user;

    }

    public Player getPlayer() {
        Player player = new Player();

        if (idUser != null) {
            player.setFkUser(this.getUser());
        }

        if (dateOfBirth != null) {
            player.setDateOfBirth(this.getDateOfBirth());
        }

        if (gender != null) {
            player.setGender(this.getGender());
        }

        return player;
    }

    public PlayerSchoolGrade getPlayerSchoolGrade() {
        PlayerSchoolGrade playerSchoolGrade = new PlayerSchoolGrade();

        if (this.year != null) {
            playerSchoolGrade.setYearClasse(this.getYear());
        }

        if (this.classe != null) {
            playerSchoolGrade.setClasse(this.getClasse());
        }

        if (this.school != null) {
            playerSchoolGrade.setFkSchool(this.getSchool());
        }

        if (this.idPlayer != null) {
            playerSchoolGrade.setFkPlayer(this.getPlayer());
        }

        return playerSchoolGrade;
    }

    public void setUser(User user) {
        this.setIdUser(user.getId());
        this.setName(user.getNameUser());
        this.setPassword(user.getPassword());
    }

    public void setPlayer(Player player) {
        this.setIdPlayer(player.getId());
        this.setDateOfBirth(player.getDateOfBirth());
        this.setGender(player.getGender());
    }

    public void setPlayerSchoolGrade(PlayerSchoolGrade playerSchoolGrade) {
        this.setIdPlayerSchoolGrade(playerSchoolGrade.getId());
        this.setYear(playerSchoolGrade.getYearClasse());
        this.setClasse(playerSchoolGrade.getClasse());
        this.setSchool(playerSchoolGrade.getFkSchool());
    }


}
