package com.infsis.Proyecto.Spring.Boot.services;

import com.infsis.Proyecto.Spring.Boot.DTOs.BlogDTO;
import com.infsis.Proyecto.Spring.Boot.DTOs.UserDTO;

import java.util.Optional;

public interface BlogService {
    Optional<BlogDTO> getBlogById(Integer blogId);
    BlogDTO saveBlog(BlogDTO blogDTO);
    BlogDTO updateBlog(Integer BlogId , BlogDTO blogDTO);
    void delete(Integer blogId);
}
