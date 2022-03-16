package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Medium;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Exemplaire
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T10:05:54.686218+01:00[Europe/Paris]")
public class Exemplaire   {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("dateEntree")
  private String dateEntree;

  @JsonProperty("medium")
  private Medium medium;

  public Exemplaire id(Long id) {
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

  public Exemplaire dateEntree(String dateEntree) {
    this.dateEntree = dateEntree;
    return this;
  }

  /**
   * Get dateEntree
   * @return dateEntree
  */
  
  @Schema(name = "dateEntree", required = false)
  public String getDateEntree() {
    return dateEntree;
  }

  public void setDateEntree(String dateEntree) {
    this.dateEntree = dateEntree;
  }

  public Exemplaire medium(Medium medium) {
    this.medium = medium;
    return this;
  }

  /**
   * Get medium
   * @return medium
  */
  @Valid 
  @Schema(name = "medium", required = false)
  public Medium getMedium() {
    return medium;
  }

  public void setMedium(Medium medium) {
    this.medium = medium;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exemplaire exemplaire = (Exemplaire) o;
    return Objects.equals(this.id, exemplaire.id) &&
        Objects.equals(this.dateEntree, exemplaire.dateEntree) &&
        Objects.equals(this.medium, exemplaire.medium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateEntree, medium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exemplaire {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateEntree: ").append(toIndentedString(dateEntree)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
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

