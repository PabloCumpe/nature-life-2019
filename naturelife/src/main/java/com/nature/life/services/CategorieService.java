package com.nature.life.services;

import org.springframework.stereotype.Service;

import com.nature.life.entity.CategoriaEntity;
import com.nature.life.repository.CategorieRepository;



@Service
public class CategorieService {
	private CategorieRepository categorieRepository;
	
	public CategorieService(CategorieRepository categorieRepository) {
		this.categorieRepository = categorieRepository;
	}
	
	
	public void createNewCategorie(CategoriaEntity categoriaEntity) {
		this.categorieRepository.save(categoriaEntity);
	}
}
