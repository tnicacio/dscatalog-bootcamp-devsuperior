package com.tnicacio.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tnicacio.dscatalog.dto.CategoryDTO;
import com.tnicacio.dscatalog.entities.Category;
import com.tnicacio.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		List<Category> categories = repository.findAll();
		List<CategoryDTO> categoriesDTO = categories.stream()
				.map(category -> new CategoryDTO(category))
				.collect(Collectors.toList());
		return categoriesDTO;
	}
}
