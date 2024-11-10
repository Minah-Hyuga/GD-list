package com.example.Data.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Article {
    private int id;
    private String ref;
    private String libelle;
    private int prix;
    private String quantiteArticle;

    public Client getArticle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArticle'");
    }
}
