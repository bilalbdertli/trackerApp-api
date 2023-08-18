package com.example.todoappapi.Service;

import com.example.todoappapi.Repo.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserServiceImpl implements UserService {
    private UserRepo userRepo;

    private PasswordEncoder passwordEncoder;
    private RoleService roleService;
    @Autowired
    public UserServiceImpl(UserRepo userRepo, PasswordEncoder passwordEncoder, RoleService roleService) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
        this.roleService = roleService;
    }

    //TODO: add required methods





}
