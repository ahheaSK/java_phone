package com.java.makara.gmail.java.phone.service;

import java.util.List;

import com.java.makara.gmail.java.phone.entity.Brand;

public interface BrandService {
	
	Brand create(Brand brand);
	Brand getById(Integer id);
	Brand update(Integer id, Brand brandUpdate);
	List<Brand> getBrands();
	List<Brand> getBrands(String name);
}
