package com.example.Services;

import java.util.List;

import com.example.Data.Entity.Article;

public interface IArticleService {
    void create(Article client);

    void add(Article article);

    List<Article> getAll();
}
