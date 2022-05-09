package com.example.demo.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Matieres;
import com.example.demo.repositories.MatieresRepo;
import com.example.demo.services.MatieresService;



@Service
public class MatieresServiceImpl implements MatieresService {
	@Autowired
	private MatieresRepo matRepo;
	public Matieres addMatiere(Matieres a) {
		return this.matRepo.save(a);		
	}
	public void  deleteMatiere(int id) {
		this.matRepo.deleteById(id);
	}
	public Matieres getById(int id) {
		Optional<Matieres>mat= this.matRepo.findById(id);
		return mat.isPresent()?mat.get():null;
	}
	public List<Matieres>getAllMatieres(){
		return this.matRepo.findAll();
	}
	public Matieres update(Matieres a) {
		return this.matRepo.save(a);
	}

}
