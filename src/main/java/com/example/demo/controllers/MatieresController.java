package com.example.demo.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Matieres;
import com.example.demo.services.MatieresService;





@CrossOrigin("*")
@RestController
@RequestMapping("api/matieres")
public class MatieresController {
	@Autowired
	MatieresService matService;
	
	@GetMapping("")
	public List<Matieres>getAllMatieres(){
		return this.matService.getAllMatieres();
	}
	@PostMapping("/add")
	public Matieres addMatiere(@RequestBody Matieres a) {
		return this.matService.addMatiere(a);
	}
	@GetMapping("/{id}")
	public Matieres getById(@PathVariable int id) {
		return this.matService.getById(id);
	}
	@PutMapping("/{id}")
	public Matieres update(@PathVariable int id,@RequestBody Matieres a) {
		return this.matService.update(a);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.matService.deleteMatiere(id);
		
	}
	
}
