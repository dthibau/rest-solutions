/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Exemplaire;
import org.openapitools.model.Medium;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T10:05:54.686218+01:00[Europe/Paris]")
@Validated
@Tag(name = "media", description = "the media API")
public interface MediaApi {

    default MediaApiDelegate getDelegate() {
        return new MediaApiDelegate() {};
    }

    /**
     * POST /media/{id}/exemplaires
     *
     * @param id  (required)
     * @return Ajout d&#39;un exemplaire (status code 201)
     */
    @Operation(
        operationId = "addExemplaire",
        tags = { "Exemplaires" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Ajout d'un exemplaire", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Exemplaire.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/media/{id}/exemplaires",
        produces = { "application/json" }
    )
    default ResponseEntity<Exemplaire> addExemplaire(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id
    ) {
        return getDelegate().addExemplaire(id);
    }


    /**
     * POST /media
     *
     * @param medium  (required)
     * @return Cr??ation d&#39;un media (status code 201)
     */
    @Operation(
        operationId = "createMedia",
        tags = { "Media" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Cr??ation d'un media", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Medium.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/media",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Medium> createMedia(
        @Parameter(name = "Medium", description = "", required = true, schema = @Schema(description = "")) @Valid @RequestBody Medium medium
    ) {
        return getDelegate().createMedia(medium);
    }


    /**
     * DELETE /media/{id}
     *
     * @param id  (required)
     * @return Suppression d&#39;un media (status code 204)
     *         or Le media n&#39;a pas ??t?? trouv?? (status code 404)
     */
    @Operation(
        operationId = "deleteById",
        tags = { "Media" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Suppression d'un media"),
            @ApiResponse(responseCode = "404", description = "Le media n'a pas ??t?? trouv??", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/media/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> deleteById(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id
    ) {
        return getDelegate().deleteById(id);
    }


    /**
     * DELETE /media/{id}/exemplaires/{idExemplaire}
     *
     * @param id  (required)
     * @param idExemplaire  (required)
     * @return Suppression d&#39;un exemplaire (status code 204)
     *         or Le media ou l&#39;exemplaire n&#39;a pas ??t?? trouv?? (status code 404)
     */
    @Operation(
        operationId = "deleteExemplaire",
        tags = { "Exemplaires" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Suppression d'un exemplaire"),
            @ApiResponse(responseCode = "404", description = "Le media ou l'exemplaire n'a pas ??t?? trouv??", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/media/{id}/exemplaires/{idExemplaire}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> deleteExemplaire(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id,
        @Parameter(name = "idExemplaire", description = "", required = true, schema = @Schema(description = "")) @PathVariable("idExemplaire") Long idExemplaire
    ) {
        return getDelegate().deleteExemplaire(id, idExemplaire);
    }


    /**
     * GET /media
     *
     * @param q  (optional)
     * @param type  (optional)
     * @param page  (optional)
     * @param size  (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "find",
        tags = { "Media" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Medium.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/media",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Medium>> find(
        @Parameter(name = "q", description = "", schema = @Schema(description = "")) @Valid @RequestParam(value = "q", required = false) String q,
        @Parameter(name = "type", description = "", schema = @Schema(description = "")) @Valid @RequestParam(value = "type", required = false) String type,
        @Parameter(name = "page", description = "", schema = @Schema(description = "")) @Valid @RequestParam(value = "page", required = false) BigDecimal page,
        @Parameter(name = "size", description = "", schema = @Schema(description = "")) @Valid @RequestParam(value = "size", required = false) BigDecimal size
    ) {
        return getDelegate().find(q, type, page, size);
    }


    /**
     * GET /media/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     *         or Le media n&#39;a pas ??t?? trouv?? (status code 404)
     */
    @Operation(
        operationId = "findById",
        tags = { "Media" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Medium.class))),
            @ApiResponse(responseCode = "404", description = "Le media n'a pas ??t?? trouv??", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/media/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Medium> findById(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id
    ) {
        return getDelegate().findById(id);
    }


    /**
     * GET /media/{id}/exemplaires
     *
     * @param id  (required)
     * @return Les exemplaires d&#39;un media particulier (status code 200)
     */
    @Operation(
        operationId = "findExemplaires",
        tags = { "Exemplaires" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Les exemplaires d'un media particulier", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Exemplaire.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/media/{id}/exemplaires",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Exemplaire>> findExemplaires(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id
    ) {
        return getDelegate().findExemplaires(id);
    }


    /**
     * PUT /media/{id}
     *
     * @param id  (required)
     * @param medium  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "replaceMedia",
        tags = { "Media" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Medium.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/media/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Medium> replaceMedia(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id,
        @Parameter(name = "Medium", description = "", required = true, schema = @Schema(description = "")) @Valid @RequestBody Medium medium
    ) {
        return getDelegate().replaceMedia(id, medium);
    }


    /**
     * PUT /media/{id}/exemplaires/{idExemplaire}
     *
     * @param id  (required)
     * @param idExemplaire  (required)
     * @param exemplaire  (optional)
     * @return Mise ?? jour d&#39;un exemplaire (status code 200)
     *         or Le media ou l&#39;exemplaire n&#39;a pas ??t?? trouv?? (status code 404)
     */
    @Operation(
        operationId = "updateExemplaire",
        tags = { "Exemplaires" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Mise ?? jour d'un exemplaire", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Exemplaire.class))),
            @ApiResponse(responseCode = "404", description = "Le media ou l'exemplaire n'a pas ??t?? trouv??", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/media/{id}/exemplaires/{idExemplaire}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Exemplaire> updateExemplaire(
        @Parameter(name = "id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id,
        @Parameter(name = "idExemplaire", description = "", required = true, schema = @Schema(description = "")) @PathVariable("idExemplaire") Long idExemplaire,
        @Parameter(name = "Exemplaire", description = "", schema = @Schema(description = "")) @Valid @RequestBody(required = false) Exemplaire exemplaire
    ) {
        return getDelegate().updateExemplaire(id, idExemplaire, exemplaire);
    }

}
