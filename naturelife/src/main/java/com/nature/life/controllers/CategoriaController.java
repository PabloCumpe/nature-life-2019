package com.nature.life.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nature.life.api.CategorieRequest;
import com.nature.life.api.ProductRequest;
import com.nature.life.entity.CategoriaEntity;
import com.nature.life.entity.ProductEntity;
import com.nature.life.services.CategorieService;

@RestController
@RequestMapping("/categories")
public class CategoriaController {
   
	private CategorieService categorieService;
	
	public CategoriaController(CategorieService categorieService) {
		this.categorieService = categorieService;
	}
	
	
	@PostMapping("/categoria")
    public void createCategorie(@RequestBody CategorieRequest categorieRequest) {
        CategoriaEntity categoriaEntity = new CategoriaEntity(categorieRequest.getNombre(),categorieRequest.getDescripcion());
        this.categorieService.createNewCategorie(categoriaEntity);	
	}
	
	
}
