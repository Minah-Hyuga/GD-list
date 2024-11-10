package com.example.Services;

import java.util.List;

import com.example.Data.Entity.Article;
import com.example.Data.Repository.list.ArticleRepository;
import com.example.Data.Repository.list.IArticleRepository;

public class ArticleService implements IArticleService {
    private final IArticleRepository articleRepository;

    public ArticleService(IArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public void create(Article article) {
        ArticleRepository.add(article);

    }

    @Override
    public List<Article> getAll() {
        return articleRepository.getAll();
    }
}
