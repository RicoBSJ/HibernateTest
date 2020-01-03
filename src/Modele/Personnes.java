package Modele;

import java.util.Date;

public class Personnes {

	private Integer idPersonne;
	private String nomPersonne;
	private String prenomPersonne;
	private Date datenaissPersonne;

	public Personnes(Integer idpersonnes, String nomPersonne, String prenomPersonne, Date datenaissPersonne) {
		this.idPersonne = idpersonnes;
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.datenaissPersonne = datenaissPersonne;
	}

	public Personnes() {
	}

	public Date getDatenaissPersonne() {
		return datenaissPersonne;
	}

	public Integer getIdPersonne() {
		return idPersonne;
	}

	public String getNomPersonne() {
		return nomPersonne;
	}

	public String getPrenomPersonne() {
		return prenomPersonne;
	}

	public void setDatenaissPersonne(Date date) {
		datenaissPersonne = date;
	}

	public void setIdPersonne(Integer integer) {
		idPersonne = integer;
	}

	public void setNomPersonne(String string) {
		nomPersonne = string;
	}

	public void setPrenomPersonne(String string) {
		prenomPersonne = string;
	}
}