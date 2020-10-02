package com.pe.apirestpaises.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pe.apirestpaises.entity.Pais;
import com.pe.apirestpaises.repository.PaisRepository;

@Service
@Transactional
public class PaisService {
	
	@Autowired
	PaisRepository paisRepository;
	
	public Page<Pais> paginas(Pageable pageable){
		return paisRepository.findAll(pageable);
	}

}
