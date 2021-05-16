package com.tnicacio.dscatalog.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.tnicacio.dscatalog.entities.Category;
import com.tnicacio.dscatalog.entities.Product;

public class ProductDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String description;
	private Double price;
	private String imgUrl;
	private Instant moment;
	
	private List<CategoryDTO> categories = new ArrayList<>();
	
	public ProductDTO() {}

	public ProductDTO(Long id, String name, String description, Double price, String imgUrl, Instant moment) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
		this.moment = moment;
	}
	
	public ProductDTO(Product entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.description = entity.getDescription();
		this.price = entity.getPrice();
		this.imgUrl = entity.getImgUrl();
		this.moment = entity.getMoment();
	}
	
	public ProductDTO(Product entity, Set<Category> categories) {
		this(entity);
		categories.forEach(category -> this.categories.add(new CategoryDTO(category)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public List<CategoryDTO> getCategories() {
		return categories;
	}
	
}
