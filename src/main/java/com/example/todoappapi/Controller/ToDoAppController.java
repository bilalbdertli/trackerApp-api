package com.example.todoappapi.Controller;

import com.example.todoappapi.Repo.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.todoappapi.Model.ToDo;

import java.util.List;


@RestController
@RequestMapping("/todoapp")
public class ToDoAppController {
    @Autowired
    ToDoRepo toDoRepo;

    @GetMapping("/getAll")
    public List<ToDo> getAll() {
        return toDoRepo.findAll();
    }

    @PostMapping("/addToDo")

    public ToDo addTodo(@RequestBody ToDo toDo) {
        return toDoRepo.save(toDo);

    }

}
