package com.example.demo.services;


import java.util.List;

import com.example.demo.entities.Matieres;


public interface MatieresService {

	public Matieres addMatiere(Matieres a);
	public void  deleteMatiere(int id);
	public Matieres getById(int id);
	public List<Matieres>getAllMatieres();
	public Matieres update(Matieres a);
}
