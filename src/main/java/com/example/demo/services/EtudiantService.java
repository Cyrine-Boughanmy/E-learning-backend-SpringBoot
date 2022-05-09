package com.example.demo.services;


import java.util.List;

import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Utilisateur;


public interface EtudiantService {

	public Etudiant addEtudiant(Etudiant a);
	public void  deleteEtudiant(int id);
	public Utilisateur getById(int id);
	public List<Utilisateur>getAllUtilisateurs();
	public Etudiant update(Etudiant a);
	public Utilisateur getByInfo(String email, String password);
}
