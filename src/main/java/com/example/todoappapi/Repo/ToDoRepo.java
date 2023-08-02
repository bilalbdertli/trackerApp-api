package com.example.todoappapi.Repo;

import com.example.todoappapi.Model.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepo extends MongoRepository<ToDo, String> {

}
