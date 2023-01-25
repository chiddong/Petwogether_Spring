package com.test.petwogether.petsitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PetSitterServiceImpl implements PetSitterService {

		@Autowired
		private PetSitterDAO dao;
}
