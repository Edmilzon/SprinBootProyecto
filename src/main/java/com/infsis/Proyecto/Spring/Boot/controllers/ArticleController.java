package com.infsis.Proyecto.Spring.Boot.controllers;

import com.infsis.Proyecto.Spring.Boot.DTOs.ArticleDTO;
import com.infsis.Proyecto.Spring.Boot.DTOs.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @GetMapping()
    public ResponseEntity<ArticleDTO> getArticle(){
        ArticleDTO articleDTO = new ArticleDTO(1,"title", "reference");
        return ResponseEntity.ok().body(articleDTO);
    }

    @GetMapping("{id}")
    public ResponseEntity<ArticleDTO>getArticle(@PathVariable Integer id){
        ArticleDTO articleDTO = new ArticleDTO(1,"title", "reference");
        return ResponseEntity.ok().body(articleDTO);
    }

    @PostMapping()
    public ResponseEntity<ArticleDTO>saveArticles(@RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok().body(articleDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ArticleDTO>updateArticles(@PathVariable Integer id , @ RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok().body(articleDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Integer id){

    }
}


