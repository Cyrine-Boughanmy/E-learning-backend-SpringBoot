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

import com.example.demo.entities.Utilisateur;
import com.example.demo.services.UtilisateurService;


@CrossOrigin("*")
@RestController
@RequestMapping("api/users")
public class UtilisateurController {
	@Autowired
	UtilisateurService userService;
	
	@GetMapping("/all")
	public List<Utilisateur>getAllUsers(){
		return this.userService.getAllUser();
	}
	@PostMapping("/add")
	public Utilisateur addUser(@RequestBody Utilisateur a) {
		return this.userService.addUser(a);
	}
	@GetMapping("/{id}")
	public Utilisateur getById(@PathVariable int id) {
		return this.userService.getById(id);
	}
	@PutMapping("/update/{id}")
	public Utilisateur update(@PathVariable int id,@RequestBody Utilisateur a) {
		return this.userService.update(a);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.userService.deleteUser(id);
		
	}
	@GetMapping("info/{email}/{password}")
	public Utilisateur getByInfo(@PathVariable String email,@PathVariable String password) {
		return this.userService.getByInfo(email,password);
	}

}

