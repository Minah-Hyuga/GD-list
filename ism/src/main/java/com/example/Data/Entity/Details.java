package com.example.Data.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Details {
    private int id;
    private int idDetteArticle;
    private int quantiteVente;
    // private LocalDateTime date;
    private String date;
    private int idClient;
    private int idArticle;
    private int idPaiement;
    private double montant;
    private int idDette;
    private String article;
    private static int nbr;

    public Details() {
        this.idDetteArticle = ++nbr;
    }

    public Details getDetails() {
        // TODO Auto-generated method stub
        return null;
    }
}
