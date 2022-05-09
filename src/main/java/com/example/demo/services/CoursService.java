package com.example.demo.services;


import java.util.List;

import com.example.demo.entities.Cours;


public interface CoursService {

	public Cours addCours(Cours a);
	public void  deleteCours(int id);
	public Cours getById(int id);
	public List<Cours>getAllcours();
	public Cours update(Cours a);
}
