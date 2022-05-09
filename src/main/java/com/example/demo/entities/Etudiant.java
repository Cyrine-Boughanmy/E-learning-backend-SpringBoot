package com.example.demo.entities;


import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("Etudiant")
public class Etudiant extends Utilisateur implements Serializable{

	private static final long serialVersionUID = 1L;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
