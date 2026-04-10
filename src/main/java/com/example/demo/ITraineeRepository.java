package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Trainee;

@Repository
public interface ITraineeRepository extends JpaRepository<Trainee, Integer> {
}