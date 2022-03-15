/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Emprunt;
import org.openapitools.model.Exemplaire;
import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-14T15:51:42.098644+01:00[Europe/Paris]")
@Validated
@Tag(name = "users", description = "the users API")
public interface UsersApi {

    default UsersApiDelegate getDelegate() {
        return new UsersApiDelegate() {};
    }

    /**
     * POST /users/{id}/emprunts
     *
     * @param id  (required)
     * @param exemplaire  (optional)
     * @return Emprunt ajouté (status code 201)
     *         or L&#39;utilisateur n&#39;existe pas (status code 404)
     */
    @Operation(
        operationId = "addEmpruntsByUser",
        tags = { "Emprunts" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Emprunt ajouté", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Emprunt.class))),
            @ApiResponse(responseCode = "404", description = "L'utilisateur n'existe pas", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/users/{id}/emprunts",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Emprunt> addEmpruntsByUser(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id,
        @Parameter(name = "Exemplaire", description = "", schema = @Schema(description = "")) @Valid @RequestBody(required = false) List<Exemplaire> exemplaire
    ) {
        return getDelegate().addEmpruntsByUser(id, exemplaire);
    }


    /**
     * GET /users/{id}/emprunts
     *
     * @param id  (required)
     * @return Les emprunts en cours du User (status code 200)
     *         or L&#39;utilisateur n&#39;existe pas (status code 404)
     */
    @Operation(
        operationId = "findEmpruntsByUser",
        tags = { "Emprunts" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Les emprunts en cours du User", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Emprunt.class))),
            @ApiResponse(responseCode = "404", description = "L'utilisateur n'existe pas", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{id}/emprunts",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Emprunt>> findEmpruntsByUser(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id
    ) {
        return getDelegate().findEmpruntsByUser(id);
    }


    /**
     * DELETE /users/{id}/emprunts/{idEmprunt}
     *
     * @param id  (required)
     * @param idEmprunt  (required)
     * @return L&#39;emprunt a été supprimé, l&#39;utilisateur a rendu ses exemplaires (status code 204)
     *         or L&#39;utilisateur n&#39;existe pas (status code 404)
     */
    @Operation(
        operationId = "removeEmpruntsByUser",
        tags = { "Emprunts" },
        responses = {
            @ApiResponse(responseCode = "204", description = "L'emprunt a été supprimé, l'utilisateur a rendu ses exemplaires"),
            @ApiResponse(responseCode = "404", description = "L'utilisateur n'existe pas", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/users/{id}/emprunts/{idEmprunt}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> removeEmpruntsByUser(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id,
        @Parameter(name = "idEmprunt", description = "", required = true, schema = @Schema(description = "")) @PathVariable("idEmprunt") Long idEmprunt
    ) {
        return getDelegate().removeEmpruntsByUser(id, idEmprunt);
    }

}
