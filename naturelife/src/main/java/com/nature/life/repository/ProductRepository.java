package com.nature.life.repository;

import java.math.BigInteger;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nature.life.entity.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProductRepository extends JpaRepository<ProductEntity, BigInteger> {

    @Query("SELECT m FROM productos m WHERE m.nombre LIKE %:nombre%")
    List<ProductEntity> searchProductsByName(@Param("nombre") String nombre);
	
}
