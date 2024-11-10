package com.example.View;

import java.util.List;

import com.example.Data.Entity.Dette;

public interface IDetteView {
    Dette saisir();

    void afficher(List<Dette> all);
}
