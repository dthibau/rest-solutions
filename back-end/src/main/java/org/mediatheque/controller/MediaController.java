package org.mediatheque.controller;

import javax.persistence.EntityNotFoundException;

import org.mediatheque.model.MediaEntity;
import org.mediatheque.repository.MediaRepository;
import org.openapitools.api.MediaApiDelegate;
import org.openapitools.model.Medium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class MediaController implements MediaApiDelegate {

	@Autowired
	MediaRepository mediaRepository;
	
	@Override
	public ResponseEntity<Medium> findById(Long id) {
		// TODO Auto-generated method stub
		MediaEntity mediaEntity = mediaRepository.findById(id.intValue()).orElseThrow(() -> new EntityNotFoundException("No such Media : " + id));
	
		return new ResponseEntity<Medium>(mediaEntity.asDto(), HttpStatus.OK);
	}

	
	
}
