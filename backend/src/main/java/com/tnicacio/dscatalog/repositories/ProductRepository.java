package com.tnicacio.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnicacio.dscatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
