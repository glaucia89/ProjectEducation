package com.fatec.neweducation.model.dto;

import com.fatec.neweducation.model.Player;
import com.fatec.neweducation.model.PlayerSchoolGrade;
import com.fatec.neweducation.model.User;
import com.fatec.neweducation.model.resources.Gender;
import com.fatec.neweducation.model.resources.TypeUser;
import java.util.Date;
import java.util.List;

/**
 * Created by glaucia on 12/08/14.
 */
public class FakeUserPlayer {

    private String name;
    private String login;
    private String password;
    private Date dateOfBirth;
    private Gender gender;
    private Integer idUser;
    private Integer idPlayer;
    private User user;
    private Player player;
    private List<PlayerSchoolGrade> listSchool;

    public FakeUserPlayer() {
    }

    public FakeUserPlayer(String name, String login, String password, Date dateOfBirth, Gender gender, Integer idUser, Integer idPlayer, User user, Player player, List<PlayerSchoolGrade> listSchool) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idUser = idUser;
        this.idPlayer = idPlayer;
        this.user = user;
        this.player = player;
        this.listSchool = listSchool;
    }


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

    public List<PlayerSchoolGrade> getListSchool() {
        return listSchool;
    }

    public void setListSchool(List<PlayerSchoolGrade> listSchool) {
        this.listSchool = listSchool;
    }


    public User getUser() {
        this.user.setTypeUser(TypeUser.ESTUDANTE);

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

        return this.user;

    }

    public Player getPlayer() {

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

   
    public void setUser(User user) {
        this.user = user;
        this.setIdUser(this.user.getId());
        this.setName(this.user.getNameUser());
        this.setPassword(this.user.getPassword());
    }

    public void setPlayer(Player player) {
        this.player = player;
        this.setIdPlayer(this.player.getId());
        this.setDateOfBirth(this.player.getDateOfBirth());
        this.setGender(this.player.getGender());
    }


}
