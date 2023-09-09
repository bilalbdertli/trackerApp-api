package com.example.todoappapi.Repo;

import com.example.todoappapi.Model.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ToDoRepo extends MongoRepository<ToDo, String> {
    public List<ToDo> findByIsChecked(boolean isChecked);
}
