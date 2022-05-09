package com.example.demo.services;


import java.util.List;



import com.example.demo.entities.Exercices;

public interface ExercicesService {

	public Exercices addExercice(Exercices a);
	public void  deleteExercice(int id);
	public Exercices getById(int id);
	public List<Exercices>getAllExercices();
	public Exercices update(Exercices a);
}
