package com.example.demo.services;


import java.util.List;

import com.example.demo.entities.Utilisateur;


public interface UtilisateurService {

	public Utilisateur addUser(Utilisateur a);
	public void  deleteUser(int id);
	public Utilisateur getById(int id);
	public List<Utilisateur>getAllUser();
	public Utilisateur update(Utilisateur a);
	public Utilisateur getByInfo(String email, String password);
}
