package com.infsis.Proyecto.Spring.Boot.services;

import com.infsis.Proyecto.Spring.Boot.DTOs.UserDTO;
import com.infsis.Proyecto.Spring.Boot.Models.User;

import java.util.Optional;

public interface UserService {


    Optional<UserDTO> getUserById(Integer userId);
    UserDTO saveUser(UserDTO userDTO);
    UserDTO updateUser(Integer userId , UserDTO userDTO);
    void delete(Integer userId);
}
