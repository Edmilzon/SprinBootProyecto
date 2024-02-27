package com.infsis.Proyecto.Spring.Boot.services.implement;

import com.infsis.Proyecto.Spring.Boot.DTOs.RoleDTO;
import com.infsis.Proyecto.Spring.Boot.DTOs.UserDTO;
import com.infsis.Proyecto.Spring.Boot.Models.Role;
import com.infsis.Proyecto.Spring.Boot.Models.User;
import com.infsis.Proyecto.Spring.Boot.services.RoleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Override
    public Optional<RoleDTO> getRoleById(Integer roleId) {
        return Optional.empty();
    }

    @Override
    public RoleDTO saveRole(RoleDTO roleDTO) {
        return null;
    }

    @Override
    public RoleDTO updateRole(Integer roleId, RoleDTO roleDTO) {
        return null;
    }

    @Override
    public void delete(Integer roleId) {

    }
    private RoleDTO RoletoDto(Role role){
        RoleDTO roleDTO = new RoleDTO(
                role.getId(),
                role.getName()

        );
        return roleDTO;
    }

    private Role DtoToRole(RoleDTO roleDTO){
        Role role = new Role();
        role.setName(roleDTO.getName());
        return role;
    }
}
