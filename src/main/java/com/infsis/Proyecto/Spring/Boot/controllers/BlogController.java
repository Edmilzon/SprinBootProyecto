package com.infsis.Proyecto.Spring.Boot.controllers;

import com.infsis.Proyecto.Spring.Boot.DTOs.BlogDTO;
import com.infsis.Proyecto.Spring.Boot.DTOs.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @GetMapping()
    public ResponseEntity<BlogDTO> getBlogs(){
        BlogDTO blogDTO = new BlogDTO(1,"blog");
        return ResponseEntity.ok().body(blogDTO);
    }

    @GetMapping("{id}")
    public ResponseEntity<BlogDTO>getblogs(@PathVariable Integer id){
        BlogDTO blogDTO = new BlogDTO(1,"Blog");
        return ResponseEntity.ok().body(blogDTO);
    }

    @PostMapping()
    public ResponseEntity<BlogDTO>saveBlogs(@RequestBody BlogDTO blogDTO){
        return ResponseEntity.ok().body(blogDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BlogDTO>updateBlogs(@PathVariable Integer id , @ RequestBody BlogDTO BlogDTO){
        return ResponseEntity.ok().body(BlogDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteBlogs(@PathVariable Integer id){

    }
}
