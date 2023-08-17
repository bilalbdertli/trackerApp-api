package com.example.todoappapi.Service;

import com.example.todoappapi.Model.Role;

import java.util.List;

public interface RoleService {
    void checkAndCreateRoles(List<String> roleNames);

    Role findByName(String roleName);
}
