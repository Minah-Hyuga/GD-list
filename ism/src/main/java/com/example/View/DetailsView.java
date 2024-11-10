package com.example.View;

import java.util.List;

import com.example.Data.Entity.Details;

public class DetailsView extends ImplView<Details> implements IDetailsView {

    @Override
    public Details saisir() {
        Details Details = new Details();
        System.out.print("Entrez la quantite de vente  : ");
        Details.setQuantiteVente(scanner.nextInt());
        System.out.print("Entrez la date : ");
        Details.setDate(scanner.nextLine());
        System.out.print("Entrez l'article : ");
        Details.setArticle(scanner.nextLine());
        return Details;
    }

    @Override
    public Details getObject(List<Details> list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObject'");
    }

}
