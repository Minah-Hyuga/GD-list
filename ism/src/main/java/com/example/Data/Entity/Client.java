package com.example.Data.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Client {
    private int id;
    private String surname;
    private String tel;
    private String addresse;
    private User user;
    private static int nbr;
    private double cumulMontantDu;
    private int idClient;

    public Client() {
        this.cumulMontantDu = 0.0;
        this.idClient = ++nbr;
    }
}
