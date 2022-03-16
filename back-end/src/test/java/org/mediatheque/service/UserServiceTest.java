package org.mediatheque.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openapitools.model.Emprunt;
import org.openapitools.model.Medium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

	@Autowired
	UserService userService;

	Medium m1 = new Medium();
	Medium m2 = new Medium();
	Medium m3 = new Medium();

	@BeforeEach
	public void initMedias() {
		m1.setId(1l);
		m2.setId(2l);
		m3.setId(3l);
	}
	
	@Test
	public void givenDavidHas2EmpruntWhenEmprunt2ThenBusinessException() {
		List<Medium> twoDispoMedia = new ArrayList<>();
		twoDispoMedia.add(m1);
		twoDispoMedia.add(m2);
		
		Assertions.assertThrows(BusinessException.class,
				() -> userService.doEmprunt(1, twoDispoMedia));
		
	}
	@Test
	public void givenLouiseHasNoEmpruntWhenEmprunt2ThenOk() throws BusinessException {
		List<Medium> twoDispoMedia = new ArrayList<>();
		twoDispoMedia.add(m1);
		twoDispoMedia.add(m2);
		
		Emprunt emprunt = userService.doEmprunt(2, twoDispoMedia);
		
		assertThat(emprunt).isNotNull()
						   .hasNoNullFieldsOrProperties();

		
	}
	
	@Test
	public void givenNoDispoWhenEmpruntThenBusinessException() {
		List<Medium> twoDispoMedia = new ArrayList<>();
		twoDispoMedia.add(m3);
		
		Assertions.assertThrows(BusinessException.class,
				() -> userService.doEmprunt(2, twoDispoMedia));
		
	}
}
