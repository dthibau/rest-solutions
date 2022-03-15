package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Book;
import org.openapitools.model.CD;
import org.openapitools.model.DVD;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Medium
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-14T15:51:42.098644+01:00[Europe/Paris]")
public class Medium   {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("titre")
  private String titre;

  @JsonProperty("dateParution")
  private String dateParution;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    CD("CD"),
    
    DVD("DVD"),
    
    BOOK("Book");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("CD")
  private CD CD;

  @JsonProperty("DVD")
  private DVD DVD;

  @JsonProperty("Book")
  private Book book;

  public Medium id(Long id) {
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

  public Medium titre(String titre) {
    this.titre = titre;
    return this;
  }

  /**
   * Get titre
   * @return titre
  */
  @Size(min = 1) 
  @Schema(name = "titre", required = false)
  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public Medium dateParution(String dateParution) {
    this.dateParution = dateParution;
    return this;
  }

  /**
   * Get dateParution
   * @return dateParution
  */
  
  @Schema(name = "dateParution", required = false)
  public String getDateParution() {
    return dateParution;
  }

  public void setDateParution(String dateParution) {
    this.dateParution = dateParution;
  }

  public Medium type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", required = false)
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Medium CD(CD CD) {
    this.CD = CD;
    return this;
  }

  /**
   * Get CD
   * @return CD
  */
  @Valid 
  @Schema(name = "CD", required = false)
  public CD getCD() {
    return CD;
  }

  public void setCD(CD CD) {
    this.CD = CD;
  }

  public Medium DVD(DVD DVD) {
    this.DVD = DVD;
    return this;
  }

  /**
   * Get DVD
   * @return DVD
  */
  @Valid 
  @Schema(name = "DVD", required = false)
  public DVD getDVD() {
    return DVD;
  }

  public void setDVD(DVD DVD) {
    this.DVD = DVD;
  }

  public Medium book(Book book) {
    this.book = book;
    return this;
  }

  /**
   * Get book
   * @return book
  */
  @Valid 
  @Schema(name = "Book", required = false)
  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Medium medium = (Medium) o;
    return Objects.equals(this.id, medium.id) &&
        Objects.equals(this.titre, medium.titre) &&
        Objects.equals(this.dateParution, medium.dateParution) &&
        Objects.equals(this.type, medium.type) &&
        Objects.equals(this.CD, medium.CD) &&
        Objects.equals(this.DVD, medium.DVD) &&
        Objects.equals(this.book, medium.book);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, titre, dateParution, type, CD, DVD, book);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Medium {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    titre: ").append(toIndentedString(titre)).append("\n");
    sb.append("    dateParution: ").append(toIndentedString(dateParution)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    CD: ").append(toIndentedString(CD)).append("\n");
    sb.append("    DVD: ").append(toIndentedString(DVD)).append("\n");
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
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

