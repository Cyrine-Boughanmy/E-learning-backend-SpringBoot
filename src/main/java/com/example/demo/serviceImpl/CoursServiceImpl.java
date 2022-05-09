package com.example.demo.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Cours;
import com.example.demo.repositories.CoursRepo;
import com.example.demo.services.CoursService;




@Service
public class CoursServiceImpl implements CoursService {
	@Autowired
	private CoursRepo coursRepo;
	public Cours addCours(Cours a) {
		return this.coursRepo.save(a);		
	}
	public void  deleteCours(int id) {
		this.coursRepo.deleteById(id);
	}
	public Cours getById(int id) {
		Optional<Cours>c= this.coursRepo.findById(id);
		return c.isPresent()?c.get():null;
	}
	
	public List<Cours>getAllcours(){
		return this.coursRepo.findAll();
	}
	public Cours update(Cours a) {
		return this.coursRepo.save(a);
	}
	

}

