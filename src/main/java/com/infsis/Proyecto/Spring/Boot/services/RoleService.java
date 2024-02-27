package com.infsis.Proyecto.Spring.Boot.services;

import com.infsis.Proyecto.Spring.Boot.DTOs.RoleDTO;
import com.infsis.Proyecto.Spring.Boot.DTOs.UserDTO;

import java.util.Optional;

public interface RoleService {
    Optional<RoleDTO> getRoleById(Integer roleId);
    RoleDTO saveRole(RoleDTO roleDTO);
    RoleDTO updateRole(Integer roleId , RoleDTO roleDTO);
    void delete(Integer roleId);
}
