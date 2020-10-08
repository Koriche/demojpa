package jpa_artifact_id.metier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Formation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // Identifiant Formation (Clé primaire)
	private String theme; // Thème formation
	private Date dateDebut; // Date début formation
	private int duree; // Durée formation
	
	@ManyToOne
	private Lieu lieu;
	
	
	// Getters et Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
}
