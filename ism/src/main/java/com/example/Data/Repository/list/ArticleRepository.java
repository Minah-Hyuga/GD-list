package com.example.Data.Repository.list;

import java.util.ArrayList;
import java.util.List;
import com.example.Data.Entity.Article;

public class ArticleRepository implements IArticleRepository {

    private List<Article> articles;

    public ArticleRepository() {
        // Initialisation de la liste des articles
        this.articles = new ArrayList<>();
    }

    @Override
    public List<Article> getAll() {
        return new ArrayList<>(articles);
    }

    // public Article getByRef(int ref) {
    // for (Article article : articles) {
    // if (article.getRef() == ref) {
    // return article;
    // }
    // }
    // return null;

    // }

    public void add(Article article) {
        articles.add(article);
    }

    // @Override
    // public boolean delete(int ref) {
    // // Recherche l'article à supprimer par sa référence
    // for (int i = 0; i < articles.size(); i++) {
    // if (articles.get(i).getRef() == ref) {
    // articles.remove(i); // Supprime l'article de la liste
    // return true; // Retourne true si la suppression a réussi
    // }
    // }
    // return false; // Retourne false si aucun article n'a été trouvé avec cette
    // référence
    // }
}
