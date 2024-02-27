package com.infsis.Proyecto.Spring.Boot.DTOs;

public class ArticleDTO {
    private Integer id;
    private String title;
    private String reference;

    public ArticleDTO(Integer id, String title, String reference) {
        this.id = id;
        this.title = title;
        this.reference = reference;
    }

    public ArticleDTO() {
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReference() {
        return reference;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
