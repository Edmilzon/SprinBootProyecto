package com.infsis.Proyecto.Spring.Boot.Models;

import io.micrometer.common.util.internal.logging.AbstractInternalLogger;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name = "\"user\"")
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
     private String email;
     private String name ;
     @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
     private List<Article> articles;
     @ManyToMany
     @JoinTable(
             name = "user_role",
             joinColumns = @JoinColumn(name = "user_id"),
             inverseJoinColumns = @JoinColumn(name = "role_id")
     )
     private List<Role> roles;
     @OneToOne(fetch = FetchType.LAZY,mappedBy = "user")
     private Blog blog;
     @CreatedDate
     private LocalDateTime createdAt;

    public User(Integer id, String email, String name, LocalDateTime createdAt) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.createdAt = createdAt;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}