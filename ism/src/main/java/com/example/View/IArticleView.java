package com.example.View;

import java.util.List;

import com.example.Data.Entity.Article;

public interface IArticleView {
    Article saisir();

    void afficher(List<Article> all);
}
