package com.infsis.Proyecto.Spring.Boot.services.implement;

import com.infsis.Proyecto.Spring.Boot.DTOs.ArticleDTO;
import com.infsis.Proyecto.Spring.Boot.DTOs.UserDTO;
import com.infsis.Proyecto.Spring.Boot.Models.Article;
import com.infsis.Proyecto.Spring.Boot.Models.User;
import com.infsis.Proyecto.Spring.Boot.services.ArticleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Override
    public Optional<ArticleDTO> getAplArticleById(Integer articleId) {
        return Optional.empty();
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public ArticleDTO updateUser(Integer articleId, ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public void delete(Integer articleId) {

    }

    private ArticleDTO ArticletoDto(Article article){
        ArticleDTO articleDTO = new ArticleDTO(
                article.getId(),
                article.getTitle(),
                article.getReference()
        );
        return articleDTO;
    }

    private Article DtoToArticle(ArticleDTO articleDTO){
        Article article = new Article();
        article.setTitle(articleDTO.getTitle());
        article.setReference(articleDTO.getReference());
        return article;
    }
}
