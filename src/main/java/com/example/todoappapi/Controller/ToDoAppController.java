package com.example.todoappapi.Controller;

import com.example.todoappapi.Model.Note;
import com.example.todoappapi.Repo.NoteRepo;
import com.example.todoappapi.Repo.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.*;
import com.example.todoappapi.Model.ToDo;

import javax.management.Query;
import java.util.List;

/*controller class*/
@RestController
@RequestMapping("/todoapp")
public class ToDoAppController {
    @Autowired
    ToDoRepo toDoRepo;

    @Autowired
    NoteRepo noteRepo;

    @GetMapping("/getAll/true")
    public List<ToDo> getAll() {
        return toDoRepo.findByIsChecked(true);
    }

    @GetMapping("/getAll/false")
    public List<ToDo> getNoteChecked() {
        return toDoRepo.findByIsChecked(false);
    }

    @GetMapping("/getAllNotes")
    public List<Note> getAllNotes() {
        return noteRepo.findAll();
    }


    @PostMapping("/addNote")

    public Note addNote(@RequestBody Note note) {
        return noteRepo.save(note);

    }

    @PostMapping("/addToDo")

    public ToDo addTodo(@RequestBody ToDo toDo) {
        return toDoRepo.save(toDo);

    }

    @PutMapping("/updateToDo/{id}")
    public String updateToDo(@PathVariable String id) {
        try {
            ToDo toDo = toDoRepo.findById(id).get();
            if (toDo.isChecked()) {
                toDo.setChecked(false);
                toDoRepo.save(toDo);
                return "To-do is checked as not done";
            }
            toDo.setChecked(true);
            toDoRepo.save(toDo);
            return "To-do is checked as done";


        }
        catch (Exception e){
            return "A problem has occurred";
        }

    }

    @DeleteMapping("/deleteToDo/{id}")
    public  String deleteToDo(@PathVariable String id){
        try {
            ToDo toDo = toDoRepo.findById(id).get();
            toDoRepo.delete(toDo);
            return "To-do is deleted";
        }
        catch (Exception e){
            return "A problem has occurred";
        }
    }


    @DeleteMapping("/deleteNote/{id}")
    public  String deleteNote(@PathVariable String id){
        try {
            Note note = noteRepo.findById(id).get();
            noteRepo.delete(note);
            return "Note is deleted";
        }
        catch (Exception e){
            return "A problem has occurred";
        }
    }

}
