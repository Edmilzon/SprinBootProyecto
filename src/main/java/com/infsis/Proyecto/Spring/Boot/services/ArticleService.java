package com.infsis.Proyecto.Spring.Boot.services;

import com.infsis.Proyecto.Spring.Boot.DTOs.ArticleDTO;
import com.infsis.Proyecto.Spring.Boot.DTOs.UserDTO;

import java.util.Optional;

public interface ArticleService {
    Optional<ArticleDTO>getAplArticleById(Integer articleId);
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    ArticleDTO updateUser(Integer articleId , ArticleDTO articleDTO);
    void delete(Integer articleId);
}
