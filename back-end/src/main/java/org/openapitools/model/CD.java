package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CD
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-14T15:51:42.098644+01:00[Europe/Paris]")
public class CD   {

  @JsonProperty("artiste")
  private String artiste;

  @JsonProperty("nbTitres")
  private Integer nbTitres;

  @JsonProperty("duree")
  private Integer duree;

  public CD artiste(String artiste) {
    this.artiste = artiste;
    return this;
  }

  /**
   * Get artiste
   * @return artiste
  */
  
  @Schema(name = "artiste", required = false)
  public String getArtiste() {
    return artiste;
  }

  public void setArtiste(String artiste) {
    this.artiste = artiste;
  }

  public CD nbTitres(Integer nbTitres) {
    this.nbTitres = nbTitres;
    return this;
  }

  /**
   * Get nbTitres
   * @return nbTitres
  */
  
  @Schema(name = "nbTitres", required = false)
  public Integer getNbTitres() {
    return nbTitres;
  }

  public void setNbTitres(Integer nbTitres) {
    this.nbTitres = nbTitres;
  }

  public CD duree(Integer duree) {
    this.duree = duree;
    return this;
  }

  /**
   * Get duree
   * minimum: 1
   * @return duree
  */
  @Min(1) 
  @Schema(name = "duree", required = false)
  public Integer getDuree() {
    return duree;
  }

  public void setDuree(Integer duree) {
    this.duree = duree;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CD CD = (CD) o;
    return Objects.equals(this.artiste, CD.artiste) &&
        Objects.equals(this.nbTitres, CD.nbTitres) &&
        Objects.equals(this.duree, CD.duree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artiste, nbTitres, duree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CD {\n");
    sb.append("    artiste: ").append(toIndentedString(artiste)).append("\n");
    sb.append("    nbTitres: ").append(toIndentedString(nbTitres)).append("\n");
    sb.append("    duree: ").append(toIndentedString(duree)).append("\n");
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

