package com.example.Data.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private int idUser;
    private String login;
    private String password;
    private String email;
    private Client client;

    public Client getArticle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArticle'");
    }
}
