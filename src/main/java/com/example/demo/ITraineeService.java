package com.example.demo;

import java.util.List;
import java.util.Optional;

import com.example.demo.Trainee;

public interface ITraineeService {
	List<Trainee> getAllTrainees();

    Optional<Trainee> getTraineeById(int id);

    Trainee addTrainee(Trainee trainee);

    Trainee updateTrainee(Trainee trainee);

    boolean deleteTrainee(int id);
}