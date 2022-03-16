package org.mediatheque.controller;

import java.util.List;

import org.mediatheque.service.BusinessException;
import org.mediatheque.service.UserService;
import org.openapitools.api.UsersApiDelegate;
import org.openapitools.model.Emprunt;
import org.openapitools.model.Medium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserController implements UsersApiDelegate {

	@Autowired
	UserService userService;

	@Override
	public ResponseEntity<Emprunt> addEmpruntsByUser(Long id, List<Medium> medium) throws BusinessException {
		Emprunt emprunt = userService.doEmprunt(id.intValue(), medium);
		
		return new ResponseEntity<Emprunt>(emprunt,HttpStatus.CREATED);
	}
	
	@Override
	public ResponseEntity<List<Emprunt>> findEmpruntsByUser(Long idUser) {
		
		List<Emprunt> emprunts = userService.getEmprunts(idUser.intValue());
		
		return new ResponseEntity<List<Emprunt>>(emprunts,HttpStatus.OK);
	}
	

}
