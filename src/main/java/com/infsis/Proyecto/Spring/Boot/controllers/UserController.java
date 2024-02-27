package com.infsis.Proyecto.Spring.Boot.controllers;

import com.infsis.Proyecto.Spring.Boot.DTOs.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping()
    public ResponseEntity<UserDTO>getUsers(){
        UserDTO userDTO = new UserDTO(1,"user", "user@user");
        return ResponseEntity.ok().body(userDTO);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDTO>getUsers(@PathVariable Integer id){
        UserDTO userDTO = new UserDTO(1,"user", "user@user");
        return ResponseEntity.ok().body(userDTO);
    }

    @PostMapping ()
    public ResponseEntity<UserDTO>saveUsers(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(userDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO>updateUsers(@PathVariable Integer id , @ RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(userDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUsers(@PathVariable Integer id){

    }
}
