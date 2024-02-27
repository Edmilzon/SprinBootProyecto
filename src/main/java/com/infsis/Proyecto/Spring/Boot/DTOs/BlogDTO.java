package com.infsis.Proyecto.Spring.Boot.DTOs;

public class BlogDTO {
    private Integer id;
     private String name;

    public BlogDTO(Integer id ,String name) {
        this.id = id;
        this.name = name;
    }

    public BlogDTO() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
