package com.java.makara.gmail.java.phone.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.java.makara.gmail.java.phone.entity.Brand;
import com.java.makara.gmail.java.phone.exception.ResourceNotFoundException;
import com.java.makara.gmail.java.phone.repository.BrandRepository;
import com.java.makara.gmail.java.phone.service.BrandService;
import com.java.makara.gmail.java.phone.service.util.PageUtil;
import com.java.makara.gmail.java.phone.spec.BrandFilter;
import com.java.makara.gmail.java.phone.spec.BrandSpec;


@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public Brand create(Brand brand) {
		// TODO Auto-generated method stub
		return brandRepository.save(brand);
	}

	@Override
	public Brand getById(Integer id) {
		return brandRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Brand", id));
	}

	@Override
	public Brand update(Integer id, Brand brandUpdate) {
		Brand brand = getById(id);
		brand.setName(brandUpdate.getName()); // @TODO improve update
		return brandRepository.save(brand);
	}

	@Override
	public Page<Brand> getBrands(Map<String, String> params) {
		BrandFilter brandFilter = new BrandFilter();
		
		if(params.containsKey("name")) {
			String name = params.get("name");
			brandFilter.setName(name);
		}
		
		if(params.containsKey("id")) {
			String id = params.get("id");
			brandFilter.setId(Integer.parseInt(id));
		}
		// @TODO add to a function for pageable
		int pageLimit = PageUtil.DEFAULT_PAGE_LIMIT;
		if(params.containsKey(PageUtil.PAGE_LIMIT)) {
			pageLimit = Integer.parseInt(params.get(PageUtil.PAGE_LIMIT));
		}
		
		int pageNumber = PageUtil.DEFAULT_PAGE_NUMBER;
		if(params.containsKey(PageUtil.PAGE_NUMBER)) {
			pageNumber = Integer.parseInt(params.get(PageUtil.PAGE_NUMBER));
		}
		
		BrandSpec brandSpec = new BrandSpec(brandFilter);
		
		Pageable pageable = PageUtil.getPageable(pageNumber, pageLimit);
		
		//Pageable
		//Page<Brand> findAll = brandRepository.findAll(brandSpec, org.springframework.data.domain.Pageable.ofSize(0));
		
		 Page<Brand> page = brandRepository.findAll(brandSpec, pageable);
		return page;
	}

	


}
