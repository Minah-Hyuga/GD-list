package com.example.View;

import java.util.List;
import java.util.Scanner;

import com.example.Data.Entity.Dette;

public class DetteView extends ImplView implements IDetteView {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Dette saisir() {
        Dette dette = new Dette();
        System.out.println("Saisir la date : ");
        dette.setDate(scanner.nextLine());

        System.out.println("Saisir le montant : ");
        dette.setMontant(Integer.parseInt(scanner.nextLine()));

        System.out.println("Saisir le montant versé : ");
        dette.setMontantVerser(Integer.parseInt(scanner.nextLine()));

        System.out.println("Saisir le montant total : ");
        dette.setMontantTotal(Double.parseDouble(scanner.nextLine())); // Conversion en double

        System.out.println("Saisir le montant restant : ");
        dette.setMontantRestant(Integer.parseInt(scanner.nextLine())); // Conversion en int

        System.out.println("Saisir le nombre d'articles : ");
        dette.setArticles(Integer.parseInt(scanner.nextLine())); // Conversion en int

        return dette;
    }

    @Override
    public Object getObject(List list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObject'");
    }

}
