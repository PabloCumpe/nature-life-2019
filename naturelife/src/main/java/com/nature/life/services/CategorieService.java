package com.nature.life.services;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nature.life.entity.CategoriaEntity;
import com.nature.life.entity.UserEntity;
import com.nature.life.repository.CategorieRepository;



@Service
public class CategorieService {
	private CategorieRepository categorieRepository;
	
	public CategorieService(CategorieRepository categorieRepository) {
		this.categorieRepository = categorieRepository;
	}
	
    public List<CategoriaEntity> getCategoriasByIds(BigInteger ... ids){
        return this.categorieRepository.findAllById(Arrays.asList(ids));
    }
    
	public void createNewCategorie(CategoriaEntity categoriaEntity) {
		this.categorieRepository.save(categoriaEntity);
	}
}
