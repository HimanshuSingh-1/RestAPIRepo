package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Trainee;
import com.example.demo.ITraineeRepository;

@Service
public class TraineeService implements ITraineeService {

    @Autowired
    private ITraineeRepository repo;

    @Override
    public List<Trainee> getAllTrainees() {
        return repo.findAll();   
    }

    @Override
    public Optional<Trainee> getTraineeById(int id) {
        return repo.findById(id);  
    }
    
    @Override
    public Trainee addTrainee(Trainee trainee) {
        return repo.save(trainee);  
    }

    @Override
    public Trainee updateTrainee(Trainee trainee) {
        return repo.save(trainee);  
    }

    @Override
    public boolean deleteTrainee(int id) {
        if (repo.existsById(id)) {  
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}