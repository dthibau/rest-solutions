package org.mediatheque.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.openapitools.model.DVD;
import org.openapitools.model.Medium;

import lombok.Data;

/**
 * The persistent class for the DVD database table.
 *
 */

@Entity
@Data
@Table(name="dvd")
@PrimaryKeyJoinColumn(name="idMedia")
public class DVDEntity  extends MediaEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(nullable=false, length=45)
	private String realisateur;
	private Integer duree;

	@Override
	public Medium asDto() {
		Medium ret = super.asDto();
		DVD dvd = new DVD();
		dvd.setRealisateur(realisateur);
		dvd.setDuree(duree);
		return ret;
	}
}
