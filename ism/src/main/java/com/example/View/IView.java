package com.example.View;

import java.util.List;

public interface IView<T> {
    T saisir();

    void afficher(List<T> list);

    T getObject(List<T> list);

    void motif(String letter);

    void motif(String letter, int nbr);
}
