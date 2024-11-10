package com.example.View;

import java.util.List;
import java.util.Scanner;

public abstract class ImplView<T> implements IView<T> {
    protected static Scanner scanner;

    public static void setScanner(Scanner scanner) {
        ImplView.scanner = scanner;
    }

    @Override
    public void afficher(List<T> list) {
        list.forEach(System.out::println);
    }

    @Override
    public void motif(String letter) {
        motif(letter, 64);
    }

    @Override
    public void motif(String letter, int nbr) {
        System.out.println(String.valueOf(letter).repeat(nbr));
    }

}
