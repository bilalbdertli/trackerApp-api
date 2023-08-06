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

        logger.info("Users have been saved! ");
        logger.info("Count of the rows: "+ count);

    }
}
