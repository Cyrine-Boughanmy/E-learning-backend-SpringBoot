package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Exercices;


public interface ExercicesRepo extends JpaRepository<Exercices, Integer> {

}
