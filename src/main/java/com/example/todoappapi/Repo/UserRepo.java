package com.example.todoappapi.Repo;

import com.example.todoappapi.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {
    public User findByUsername(String username);

    Boolean existsByUsername(String username);

    void deleteByUsername(String username);
}
