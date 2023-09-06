package com.example.todoappapi.Repo;

import com.example.todoappapi.Model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepo  extends MongoRepository<Note, String> {

}
