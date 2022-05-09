package com.example.demo.entities;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="T_matieres")

public class Matieres implements Serializable{
	@OneToMany(cascade = CascadeType.ALL,mappedBy="matiere")
	private List<Cours> cours = new ArrayList<Cours>();
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="mat_id")
	private int id;
	@Column(name="mat_titre")
	private String titre;
	public Matieres(int id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	@Override
	public String toString() {
		return "Matieres [id=" + id + ", titre=" + titre + ", cours=" + cours + " ]";
	}
	
	
 
}
