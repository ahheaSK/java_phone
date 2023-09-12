package com.java.makara.gmail.java.phone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.makara.gmail.java.phone.entity.Brand;
import com.java.makara.gmail.java.phone.repository.BrandRepository;
import com.java.makara.gmail.java.phone.service.BrandService;


@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public Brand create(Brand brand) {
		// TODO Auto-generated method stub
		return brandRepository.save(brand);
	}

}
