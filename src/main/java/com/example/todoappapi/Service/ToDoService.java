package com.example.todoappapi.Service;

public interface ToDoService {

    void createToDo(String username, String description, String dueDate);
    void updateToDo(String username, String id, String description, String dueDate);
}
