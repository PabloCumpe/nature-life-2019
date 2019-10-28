package com.nature.life.services;

import java.math.BigInteger;
import java.util.List;

import com.nature.life.entity.CategoriaEntity;
import com.nature.life.entity.CustomerEntity;
import com.nature.life.entity.ProductEntity;
import com.nature.life.entity.PurchaseEntity;
import com.nature.life.exceptions.NaturLifeException;
import com.nature.life.repository.PurchaseRepository;

public class PurchaseService {
	
	
	private PurchaseRepository purchaseRepository;
	private UserService userService;
		
	public PurchaseService(PurchaseRepository purchaseRepository, UserService userService) {
		this.purchaseRepository = purchaseRepository;
		this.userService = userService;
			
	}
	
	
    public void createNewPurchase(BigInteger cartId,BigInteger userId, BigInteger paymentMethodId, PurchaseEntity purchaseEntity) {
        final List<CustomerEntity> customers = this.userService.getUserByIds(userId);
        CustomerEntity customerEntity = customers.stream()
                .findFirst()
                .orElseThrow(() -> new NaturLifeException("No existe cliente con ese id"));
        purchaseEntity.setCustomer(customerEntity);
        this.purchaseRepository.save(purchaseEntity);
    }


	
	
}
