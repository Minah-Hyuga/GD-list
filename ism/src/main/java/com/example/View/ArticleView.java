package com.example.View;

import java.util.List;

import com.example.Data.Entity.Article;

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
    public void afficher(List<Article> all) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'afficher'");
    }

    @Override
    public Article getObject(List<Article> list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObject'");
    }
}