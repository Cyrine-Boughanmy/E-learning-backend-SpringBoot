package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Matieres;


public interface MatieresRepo extends JpaRepository<Matieres, Integer> {

}
