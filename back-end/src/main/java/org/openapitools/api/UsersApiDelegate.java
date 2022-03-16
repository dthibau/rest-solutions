package org.openapitools.api;

import org.openapitools.model.Emprunt;
import java.util.List;
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
 * A delegate to be called by the {@link UsersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T10:05:54.686218+01:00[Europe/Paris]")
public interface UsersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /users/{id}/emprunts
     *
     * @param id  (required)
     * @param medium  (optional)
     * @return Emprunt ajouté (status code 201)
     *         or L&#39;utilisateur n&#39;existe pas (status code 404)
     * @see UsersApi#addEmpruntsByUser
     */
    default ResponseEntity<Emprunt> addEmpruntsByUser(Long id,
        List<Medium> medium) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dateEmprunt\" : \"dateEmprunt\", \"exemplaires\" : [ { \"id\" : 0, \"dateEntree\" : \"dateEntree\", \"medium\" : { \"CD\" : { \"artiste\" : \"artiste\", \"duree\" : 1, \"nbTitres\" : 6 }, \"DVD\" : { \"realisateur\" : \"realisateur\", \"duree\" : 1 }, \"titre\" : \"titre\", \"Book\" : { \"isbn\" : \"isbn\", \"auteur\" : \"auteur\" }, \"id\" : 0, \"dateParution\" : \"dateParution\", \"type\" : \"CD\" } }, { \"id\" : 0, \"dateEntree\" : \"dateEntree\", \"medium\" : { \"CD\" : { \"artiste\" : \"artiste\", \"duree\" : 1, \"nbTitres\" : 6 }, \"DVD\" : { \"realisateur\" : \"realisateur\", \"duree\" : 1 }, \"titre\" : \"titre\", \"Book\" : { \"isbn\" : \"isbn\", \"auteur\" : \"auteur\" }, \"id\" : 0, \"dateParution\" : \"dateParution\", \"type\" : \"CD\" } } ], \"dateRetour\" : \"dateRetour\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /users/{id}/emprunts
     *
     * @param id  (required)
     * @return Les emprunts en cours du User (status code 200)
     *         or L&#39;utilisateur n&#39;existe pas (status code 404)
     * @see UsersApi#findEmpruntsByUser
     */
    default ResponseEntity<List<Emprunt>> findEmpruntsByUser(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dateEmprunt\" : \"dateEmprunt\", \"exemplaires\" : [ { \"id\" : 0, \"dateEntree\" : \"dateEntree\", \"medium\" : { \"CD\" : { \"artiste\" : \"artiste\", \"duree\" : 1, \"nbTitres\" : 6 }, \"DVD\" : { \"realisateur\" : \"realisateur\", \"duree\" : 1 }, \"titre\" : \"titre\", \"Book\" : { \"isbn\" : \"isbn\", \"auteur\" : \"auteur\" }, \"id\" : 0, \"dateParution\" : \"dateParution\", \"type\" : \"CD\" } }, { \"id\" : 0, \"dateEntree\" : \"dateEntree\", \"medium\" : { \"CD\" : { \"artiste\" : \"artiste\", \"duree\" : 1, \"nbTitres\" : 6 }, \"DVD\" : { \"realisateur\" : \"realisateur\", \"duree\" : 1 }, \"titre\" : \"titre\", \"Book\" : { \"isbn\" : \"isbn\", \"auteur\" : \"auteur\" }, \"id\" : 0, \"dateParution\" : \"dateParution\", \"type\" : \"CD\" } } ], \"dateRetour\" : \"dateRetour\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /users/{id}/emprunts/{idEmprunt}
     *
     * @param id  (required)
     * @param idEmprunt  (required)
     * @return L&#39;emprunt a été supprimé, l&#39;utilisateur a rendu ses exemplaires (status code 204)
     *         or L&#39;utilisateur n&#39;existe pas (status code 404)
     * @see UsersApi#removeEmpruntsByUser
     */
    default ResponseEntity<Void> removeEmpruntsByUser(Long id,
        Long idEmprunt) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
