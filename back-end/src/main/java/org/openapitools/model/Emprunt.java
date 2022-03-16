package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Exemplaire;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Emprunt
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T10:05:54.686218+01:00[Europe/Paris]")
public class Emprunt   {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("dateEmprunt")
  private String dateEmprunt;

  @JsonProperty("dateRetour")
  private String dateRetour;

  @JsonProperty("exemplaires")
  @Valid
  private List<Exemplaire> exemplaires = null;

  public Emprunt id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Emprunt dateEmprunt(String dateEmprunt) {
    this.dateEmprunt = dateEmprunt;
    return this;
  }

  /**
   * Get dateEmprunt
   * @return dateEmprunt
  */
  
  @Schema(name = "dateEmprunt", required = false)
  public String getDateEmprunt() {
    return dateEmprunt;
  }

  public void setDateEmprunt(String dateEmprunt) {
    this.dateEmprunt = dateEmprunt;
  }

  public Emprunt dateRetour(String dateRetour) {
    this.dateRetour = dateRetour;
    return this;
  }

  /**
   * Get dateRetour
   * @return dateRetour
  */
  
  @Schema(name = "dateRetour", required = false)
  public String getDateRetour() {
    return dateRetour;
  }

  public void setDateRetour(String dateRetour) {
    this.dateRetour = dateRetour;
  }

  public Emprunt exemplaires(List<Exemplaire> exemplaires) {
    this.exemplaires = exemplaires;
    return this;
  }

  public Emprunt addExemplairesItem(Exemplaire exemplairesItem) {
    if (this.exemplaires == null) {
      this.exemplaires = new ArrayList<>();
    }
    this.exemplaires.add(exemplairesItem);
    return this;
  }

  /**
   * Get exemplaires
   * @return exemplaires
  */
  @Valid 
  @Schema(name = "exemplaires", required = false)
  public List<Exemplaire> getExemplaires() {
    return exemplaires;
  }

  public void setExemplaires(List<Exemplaire> exemplaires) {
    this.exemplaires = exemplaires;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emprunt emprunt = (Emprunt) o;
    return Objects.equals(this.id, emprunt.id) &&
        Objects.equals(this.dateEmprunt, emprunt.dateEmprunt) &&
        Objects.equals(this.dateRetour, emprunt.dateRetour) &&
        Objects.equals(this.exemplaires, emprunt.exemplaires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateEmprunt, dateRetour, exemplaires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emprunt {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateEmprunt: ").append(toIndentedString(dateEmprunt)).append("\n");
    sb.append("    dateRetour: ").append(toIndentedString(dateRetour)).append("\n");
    sb.append("    exemplaires: ").append(toIndentedString(exemplaires)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

