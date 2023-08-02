package com.example.todoappapi.Model;

import org.springframework.data.annotation.Id;

public class ToDo {
    private boolean isChecked;
    private String description;
    private String title;
    private String dueDate;

    @Id
    private  String id;

    public ToDo() {
    }
    public ToDo(boolean isChecked, String description, String title, String dueDate) {
        this.isChecked = isChecked;
        this.description = description;
        this.title = title;
        this.dueDate = dueDate;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
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
        return  "id=" + id + ", title=" + title +  ", description=" + description + ", dueDate=" + dueDate;
    }

}
