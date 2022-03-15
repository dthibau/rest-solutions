package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Exemplaire;
import org.openapitools.model.Medium;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link MediaApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-14T15:51:42.098644+01:00[Europe/Paris]")
public interface MediaApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /media/{id}/exemplaires
     *
     * @param id  (required)
     * @return Ajout d&#39;un exemplaire (status code 201)
     * @see MediaApi#addExemplaire
     */
    default ResponseEntity<Exemplaire> addExemplaire(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"dateEntree\" : \"dateEntree\", \"medium\" : { \"CD\" : { \"artiste\" : \"artiste\", \"duree\" : 1, \"nbTitres\" : 6 }, \"DVD\" : { \"realisateur\" : \"realisateur\", \"duree\" : 1 }, \"titre\" : \"titre\", \"Book\" : { \"isbn\" : \"isbn\", \"auteur\" : \"auteur\" }, \"id\" : 0, \"dateParution\" : \"dateParution\", \"type\" : \"CD\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /media
     *
     * @param medium  (required)
     * @return Création d&#39;un media (status code 201)
     * @see MediaApi#createMedia
     */
    default ResponseEntity<Medium> createMedia(Medium medium) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"CD\" : { \"artiste\" : \"artiste\", \"duree\" : 1, \"nbTitres\" : 6 }, \"DVD\" : { \"realisateur\" : \"realisateur\", \"duree\" : 1 }, \"titre\" : \"titre\", \"Book\" : { \"isbn\" : \"isbn\", \"auteur\" : \"auteur\" }, \"id\" : 0, \"dateParution\" : \"dateParution\", \"type\" : \"CD\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /media/{id}
     *
     * @param id  (required)
     * @return Suppression d&#39;un media (status code 204)
     *         or Le media n&#39;a pas été trouvé (status code 404)
     * @see MediaApi#deleteById
     */
    default ResponseEntity<Void> deleteById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /media/{id}/exemplaires/{idExemplaire}
     *
     * @param id  (required)
     * @param idExemplaire  (required)
     * @return Suppression d&#39;un exemplaire (status code 204)
     *         or Le media ou l&#39;exemplaire n&#39;a pas été trouvé (status code 404)
     * @see MediaApi#deleteExemplaire
     */
    default ResponseEntity<Void> deleteExemplaire(Long id,
        Long idExemplaire) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /media
     *
     * @param q  (optional)
     * @param type  (optional)
     * @param page  (optional)
     * @param size  (optional)
     * @return OK (status code 200)
     * @see MediaApi#find
     */
    default ResponseEntity<List<Medium>> find(String q,
        String type,
        BigDecimal page,
        BigDecimal size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"CD\" : { \"artiste\" : \"artiste\", \"duree\" : 1, \"nbTitres\" : 6 }, \"DVD\" : { \"realisateur\" : \"realisateur\", \"duree\" : 1 }, \"titre\" : \"titre\", \"Book\" : { \"isbn\" : \"isbn\", \"auteur\" : \"auteur\" }, \"id\" : 0, \"dateParution\" : \"dateParution\", \"type\" : \"CD\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /media/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     *         or Le media n&#39;a pas été trouvé (status code 404)
     * @see MediaApi#findById
     */
    default ResponseEntity<Medium> findById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"CD\" : { \"artiste\" : \"artiste\", \"duree\" : 1, \"nbTitres\" : 6 }, \"DVD\" : { \"realisateur\" : \"realisateur\", \"duree\" : 1 }, \"titre\" : \"titre\", \"Book\" : { \"isbn\" : \"isbn\", \"auteur\" : \"auteur\" }, \"id\" : 0, \"dateParution\" : \"dateParution\", \"type\" : \"CD\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /media/{id}/exemplaires
     *
     * @param id  (required)
     * @return Les exemplaires d&#39;un media particulier (status code 200)
     * @see MediaApi#findExemplaires
     */
    default ResponseEntity<List<Exemplaire>> findExemplaires(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"dateEntree\" : \"dateEntree\", \"medium\" : { \"CD\" : { \"artiste\" : \"artiste\", \"duree\" : 1, \"nbTitres\" : 6 }, \"DVD\" : { \"realisateur\" : \"realisateur\", \"duree\" : 1 }, \"titre\" : \"titre\", \"Book\" : { \"isbn\" : \"isbn\", \"auteur\" : \"auteur\" }, \"id\" : 0, \"dateParution\" : \"dateParution\", \"type\" : \"CD\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /media/{id}
     *
     * @param id  (required)
     * @param medium  (required)
     * @return OK (status code 200)
     * @see MediaApi#replaceMedia
     */
    default ResponseEntity<Medium> replaceMedia(Long id,
        Medium medium) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"CD\" : { \"artiste\" : \"artiste\", \"duree\" : 1, \"nbTitres\" : 6 }, \"DVD\" : { \"realisateur\" : \"realisateur\", \"duree\" : 1 }, \"titre\" : \"titre\", \"Book\" : { \"isbn\" : \"isbn\", \"auteur\" : \"auteur\" }, \"id\" : 0, \"dateParution\" : \"dateParution\", \"type\" : \"CD\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /media/{id}/exemplaires/{idExemplaire}
     *
     * @param id  (required)
     * @param idExemplaire  (required)
     * @param exemplaire  (optional)
     * @return Mise à jour d&#39;un exemplaire (status code 200)
     *         or Le media ou l&#39;exemplaire n&#39;a pas été trouvé (status code 404)
     * @see MediaApi#updateExemplaire
     */
    default ResponseEntity<Exemplaire> updateExemplaire(Long id,
        Long idExemplaire,
        Exemplaire exemplaire) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"dateEntree\" : \"dateEntree\", \"medium\" : { \"CD\" : { \"artiste\" : \"artiste\", \"duree\" : 1, \"nbTitres\" : 6 }, \"DVD\" : { \"realisateur\" : \"realisateur\", \"duree\" : 1 }, \"titre\" : \"titre\", \"Book\" : { \"isbn\" : \"isbn\", \"auteur\" : \"auteur\" }, \"id\" : 0, \"dateParution\" : \"dateParution\", \"type\" : \"CD\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
