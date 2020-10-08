package jpa_artifact_id.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lieu {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // Identifiant Lieu (Clé primaire)
	private String nom;
	private String adresse;
	
	// Constructeur
		public Lieu(String lieu) {
			super();
		}	
		
		public Lieu(String nom, String adresse) {
			super();
			this.nom = nom;
			this.adresse = adresse;
		}
		
		
	
	private String lieu; // Thème lieu
	
	// Getters et Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	
	
	
	
}
