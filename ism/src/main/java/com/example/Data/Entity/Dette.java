package com.example.Data.Entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Dette {
    // private LocalDateTime date;
    private int idDette;
    private String date;
    private int montant;
    private double montantTotal;
    private LocalDate dateCreation;
    private int montantVerser;
    private int montantRestant;
    private int articles;
    private int payement;
    private Client client;
    private static int nbr;

    public Dette getDette() {
        // TODO Auto-generated method stub
        return null;
    }

    public Dette() {

        this.idDette = ++nbr;
        this.dateCreation = LocalDate.now();
        this.montantTotal = 0.0;
        this.montantVerser = 0;
    }
}