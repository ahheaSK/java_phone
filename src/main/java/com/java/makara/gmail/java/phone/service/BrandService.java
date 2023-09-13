package com.java.makara.gmail.java.phone.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import com.java.makara.gmail.java.phone.entity.Brand;

public interface BrandService {
	
	Brand create(Brand brand);
	Brand getById(Integer id);
	Brand update(Integer id, Brand brandUpdate);
	Page<Brand> getBrands(Map<String, String> params);
}
