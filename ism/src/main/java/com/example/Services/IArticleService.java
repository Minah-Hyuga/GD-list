package com.example.Services;

import java.util.List;

import com.example.Data.Entity.Article;

public interface IArticleService {
    void create(Article client);

    List<Article> getAll();
}
