package com.example.View;

import java.util.List;

import com.example.Data.Entity.Details;

public interface IDetailsView {

    Details saisir();

    void afficher(List<Details> all);
}
