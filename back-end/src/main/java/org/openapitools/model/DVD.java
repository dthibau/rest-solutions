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
 * DVD
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T10:05:54.686218+01:00[Europe/Paris]")
public class DVD   {

  @JsonProperty("realisateur")
  private String realisateur;

  @JsonProperty("duree")
  private Integer duree;

  public DVD realisateur(String realisateur) {
    this.realisateur = realisateur;
    return this;
  }

  /**
   * Get realisateur
   * @return realisateur
  */
  
  @Schema(name = "realisateur", required = false)
  public String getRealisateur() {
    return realisateur;
  }

  public void setRealisateur(String realisateur) {
    this.realisateur = realisateur;
  }

  public DVD duree(Integer duree) {
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
    DVD DVD = (DVD) o;
    return Objects.equals(this.realisateur, DVD.realisateur) &&
        Objects.equals(this.duree, DVD.duree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realisateur, duree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DVD {\n");
    sb.append("    realisateur: ").append(toIndentedString(realisateur)).append("\n");
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

