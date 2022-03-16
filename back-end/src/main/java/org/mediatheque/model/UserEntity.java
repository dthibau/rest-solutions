package org.mediatheque.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.mediatheque.service.BusinessException;
import org.openapitools.model.Exemplaire;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


/**
 * The persistent class for the User database table.
 *
 */

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id;
	@NonNull
	private String login;
	@NonNull
	private String pwd;
	@NonNull
	private String nom;
	@NonNull
	private String prenom;
	@NonNull
	private String telephone;
	
	public static int MAX_EMPRUNTS=3;

	//bi-directional one-to-many association to Emprunt
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<EmpruntEntity> emprunts = new ArrayList<EmpruntEntity>();

	public void emprunte(List<ExemplaireEntity> exemplaires ) throws BusinessException {
		int nbEncours = emprunts.stream().map(e -> e.getExemplaires().size()).reduce(0, (a,b) -> a + b);
		if ( nbEncours + exemplaires.size() > MAX_EMPRUNTS ) {
			throw new BusinessException("Maximum d'emprunts atteint");
		}
		EmpruntEntity emprunt = new EmpruntEntity();
		Calendar cal = Calendar.getInstance();
		emprunt.setDate_emprunt(cal.getTime());
		cal.add(Calendar.DAY_OF_YEAR, 7);
		emprunt.setDate_limite(cal.getTime());
		emprunt.setExemplaires(exemplaires);
		emprunt.setUser(this);
		emprunts.add(emprunt);
		
	}

	@Transient
	public String getNomComplet() {
		return getPrenom() + " " + getNom();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", login=" + login + ", nom=" + nom + ", prenom=" + prenom + ", telephone="
				+ telephone + "]";
	}
}
