package com.infsis.Proyecto.Spring.Boot.controllers;

import com.infsis.Proyecto.Spring.Boot.DTOs.RoleDTO;
import com.infsis.Proyecto.Spring.Boot.DTOs.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleCotroller {

    @GetMapping()
    public ResponseEntity<RoleDTO> getRoles(){
        RoleDTO roleDTO = new RoleDTO(1, "role");
        return ResponseEntity.ok().body(roleDTO);
    }

    @GetMapping("{id}")
    public ResponseEntity<RoleDTO>getRoles(@PathVariable Integer id){
        RoleDTO roleDTO = new RoleDTO(1, "role");
        return ResponseEntity.ok().body(roleDTO);
    }

    @PostMapping()
    public ResponseEntity<RoleDTO>saveRoles(@RequestBody RoleDTO roleDTO){
        return ResponseEntity.ok().body(roleDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoleDTO>updateRoles(@PathVariable Integer id , @ RequestBody RoleDTO roleDTO){
        return ResponseEntity.ok().body(roleDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRoles(@PathVariable Integer id){

    }
}
