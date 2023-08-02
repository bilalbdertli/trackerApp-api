package com.example.todoappapi;

import com.example.todoappapi.Model.ToDo;
import com.example.todoappapi.Repo.ToDoRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TodoAppApiApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(TodoAppApiApplication.class);

    @Autowired
    ToDoRepo  toDoRepo;
    public static void main(String[] args) {
        SpringApplication.run(TodoAppApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        long count = toDoRepo.count();
        if(count == 0){
            List<ToDo> toDoList = new ArrayList<>();

            toDoList.add(0, new ToDo(true, "Learn Spring Boot", "Learn Spring Boot", "2022-01-01"));
            toDoList.add(1, new ToDo(true, "Learn Spring Data JPA", "Learn Spring Data JPA", "2022-01-01"));
            toDoList.add(2, new ToDo(true, "Learn Spring Cloud", "Learn Spring Cloud", "2022-01-01"));
            toDoList.add(3, new ToDo(true, "Learn Spring Cloud Stream", "Learn Spring Cloud Stream", "2022-01-01"));

            toDoRepo.insert(toDoList);
        }
        logger.info("Users have been saved! ");
        logger.info("Count of the rows: "+ count);


    }
}
