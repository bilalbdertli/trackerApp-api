package com.example.todoappapi.Model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Note {

    private String description;
    private String title;
    private LocalDateTime dueDate;

    @Id
    private  String id;

    public Note() {

    }

    public Note(String description, String title, LocalDateTime dueDate) {
        this.description = description;
        this.title = title;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Note{" +
                "description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
