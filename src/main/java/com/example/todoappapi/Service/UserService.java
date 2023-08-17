package com.example.todoappapi.Service;

import com.example.todoappapi.Model.User;

import java.util.Optional;

public interface UserService {

    User findById(Long userId);

    void checkAndCreateAdminUser();
    User createNewUser(User newUser,String password, Boolean isAdmin);

    void updateUser(String currentUsername, String newUsername,String newPassword);

    Optional<User> findByUserName(String username);

    void deleteUser(String username);

}
