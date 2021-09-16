package fr.eni.jpa.entity.joined;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "JoinedBerlineEntity")
@Table(name = "JoinedBerline")
@DiscriminatorValue(value = "B")
public class Berline extends Voiture {
	
	private String couleurCuir;

	public Berline(String marque, String couleurCuir) {
		super(marque);
		this.couleurCuir = couleurCuir;
	}
	
	public Berline() {
		super();
	}

	public String getCouleurCuir() {
		return couleurCuir;
	}

	public void setCouleurCuir(String couleurCuir) {
		this.couleurCuir = couleurCuir;
	}
	
	
	

}
