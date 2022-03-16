package org.mediatheque.service;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;
import javax.transaction.Transactional;

import org.mediatheque.model.EmpruntEntity;
import org.mediatheque.model.ExemplaireEntity;
import org.mediatheque.model.UserEntity;
import org.mediatheque.repository.MediaRepository;
import org.mediatheque.repository.UserRepository;
import org.openapitools.model.Emprunt;
import org.openapitools.model.Medium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MediaRepository mediaRepository;
	
	public Emprunt doEmprunt(Integer idUser, List<Medium> medias) throws BusinessException {
	
		UserEntity userEntity = userRepository.fullLoad(idUser).orElseThrow(() -> new BusinessException("No such User"));
		List<ExemplaireEntity> found = new ArrayList<>();
		for ( Medium media : medias ) {
			List<ExemplaireEntity> dispo = mediaRepository.findExemplaireDisponible(media.getId().intValue());
			if ( dispo.isEmpty() ) {
				throw new BusinessException("Plus d'exemplaires disponible");
			} else {
				found.add(dispo.get(0));
			}
		}
		userEntity.emprunte(found);
		
		userRepository.save(userEntity);
		
		return userEntity.getEmprunts().get(userEntity.getEmprunts().size()-1).asDto(); 
	}
}
