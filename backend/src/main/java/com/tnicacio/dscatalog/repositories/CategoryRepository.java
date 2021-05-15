package com.tnicacio.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnicacio.dscatalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
