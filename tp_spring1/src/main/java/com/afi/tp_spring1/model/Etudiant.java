package com.afi.tp_spring1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Etudiant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String prenom;
	private String nom;
	private String tel;
	private String filiere;
	private String niveau;
	private String nationnalite;
	
	public Etudiant() {
		super();
	}
	
	public Etudiant(long id, String prenom, String nom, String tel, String filiere, String niveau,
			String nationnalite) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.tel = tel;
		this.filiere = filiere;
		this.niveau = niveau;
		this.nationnalite = nationnalite;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getNationnalite() {
		return nationnalite;
	}
	public void setNationnalite(String nationnalite) {
		this.nationnalite = nationnalite;
	}
	
	

}
