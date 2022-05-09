package com.example.demo.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Utilisateur;
import com.example.demo.repositories.UtilisateurRepo;
import com.example.demo.services.UtilisateurService;


@Service
public class UtilisateurServiceImpl implements UtilisateurService{

	@Autowired
	private UtilisateurRepo userRepo;
	public Utilisateur addUser(Utilisateur a) {
		return this.userRepo.save(a);		
	}
	public void  deleteUser(int id) {
		this.userRepo.deleteById(id);
	}
	public Utilisateur getById(int id) {
		Optional<Utilisateur> user= this.userRepo.findById(id);
		return user.isPresent()?user.get():null;
	}
	public List<Utilisateur>getAllUser(){
		return this.userRepo.findAll();
	}
	public Utilisateur update(Utilisateur a) {
		return this.userRepo.save(a);
	}
	@Override
	public Utilisateur getByInfo(String email, String password) {
		
			return this.userRepo.getByInfo(email,password);
		
	}
}
