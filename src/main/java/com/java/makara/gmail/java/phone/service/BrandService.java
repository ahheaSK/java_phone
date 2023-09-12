package com.java.makara.gmail.java.phone.service;

import com.java.makara.gmail.java.phone.entity.Brand;

public interface BrandService {
	
	Brand create(Brand brand);
	Brand getById(Integer id);
	Brand update(Integer id, Brand brandUpdate);
	
}
