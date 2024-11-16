package com.example.View;

import java.util.List;

import com.example.Data.Entity.Article;
import com.example.Data.Entity.Client;

public class ArticleView extends ImplView<Article> implements IArticleView {
    @Override
    public Article saisir() {
        Article Article = new Article();
        System.out.print("Entrez la reference de l'article : ");
        Article.setRef(scanner.nextLine());
        System.out.print("Entrez le libelle de l'article : ");
        Article.setLibelle(scanner.nextLine());
        System.out.print("Entrez le prix de l'article : ");
        Article.setPrix(scanner.nextInt());
        System.out.print("Entrez le telepone de l'article : ");
        Article.setQuantiteArticle(scanner.nextLine());
        return Article;
    }

    @Override
    public void afficher(List<Article> articles) {
        if (articles.isEmpty()) {
            System.out.println("Aucun article enregistré.");
        } else {
            System.out.println("Liste des articles ajoutés :");
            for (Article article : articles) {
                System.out.println("---------------------------");
                System.out.println("Réference : " + article.getRef());
                System.out.println("Libellé : " + article.getLibelle());
                System.out.println("Prix : " + article.getPrix());
                System.out.println("Quantité de l'article : " + article.getQuantiteArticle());
                System.out.println("---------------------------");
            }
        }
    }

    @Override
    public Article getObject(List<Article> list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObject'");
    }
}