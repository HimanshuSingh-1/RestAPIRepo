package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.Trainee;
import com.example.demo.ITraineeService;

@SpringBootApplication
public class TraineeApiApplication  {

    @Autowired
    private ITraineeService service;

    public static void main(String[] args) {
        SpringApplication.run(TraineeApiApplication.class, args);
    }

}