package com.example.View;

import java.util.List;
import java.util.Scanner;

import com.example.Data.Entity.Client;
import com.example.Data.Entity.Dette;

public class DetteView extends ImplView<Dette> implements IDetteView {
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
    public void afficher(List<Dette> dettes) {
        if (dettes.isEmpty()) {
            System.out.println("Aucune dette enregistrée.");
        } else {
            System.out.println("Liste des dettes enregistrées :");
            for (Dette d : dettes) {
                System.out.println("Date : " + d.getDate());
                System.out.println("Montant : " + d.getMontant());
                System.out.println("Montant Total : " + d.getMontantTotal());
                System.out.println("Montant Versé : " + d.getMontantVerser());
                System.out.println("Montant Restant : " + d.getMontantRestant());
                System.out.println("Articles : " + d.getArticles());
                System.out.println("Paiement : " + d.getPayement());
                System.out.println(
                        "Client : " + (d.getClient() != null ? d.getClient().getSurname() : "Aucun client associé"));
                System.out.println("---------------------------");
            }
        }
    }

    @Override
    public Dette getObject(List<Dette> list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObject'");
    }

}
