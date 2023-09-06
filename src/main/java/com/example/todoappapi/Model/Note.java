package com.example.todoappapi.Model;

import org.springframework.data.annotation.Id;

public class Note {

    private String description;
    private String title;
    private String dueDate;

    @Id
    private  String id;

    public Note() {

    }

    public Note(String description, String title, String dueDate) {
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

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
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
