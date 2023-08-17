package com.example.todoappapi.Repo;

import com.example.todoappapi.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, String> {
    public User findByUsername(String username);
}
