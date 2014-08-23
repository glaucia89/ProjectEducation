package com.fatec.neweducation.model.dto;

import com.fatec.neweducation.model.Player;
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
    private TypeUser typeUser;
    private Integer idUser;
    private Integer idPlayer;

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

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }

    public User getUser() {
        User user = new User();

        if (idUser != null) {
            user.setId(this.getIdUser());
        }

        if (name != null) {
            user.setNameUser(this.getName());
        }

        if (login != null) {
            user.setLoginUser(this.getLogin());
        }

        if (typeUser != null) {
            user.setTypeUser(this.getTypeUser().getValor());
        }

        if (password != null) {
            user.setPassword(this.getPassword());
        }

        return user;

    }


    public Player getPlayer() {
        Player player = new Player();

        if (idUser != null) {
            player.setFkUser(this.getUser().getId());
        }

        if (dateOfBirth != null) {
            player.setDateOfBirth(this.getDateOfBirth());
        }

        if (gender != null) {
            player.setGender(this.getGender().getValor());
        }

        return player;
    }
}
