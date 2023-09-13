package com.java.makara.gmail.java.phone.service.impl;

import org.springframework.stereotype.Service;

import com.java.makara.gmail.java.phone.entity.Model;
import com.java.makara.gmail.java.phone.repository.ModelRepository;
import com.java.makara.gmail.java.phone.service.ModelService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ModelServiceImpl implements ModelService {

	private final ModelRepository modelRepository;
	
	@Override
	public Model save(Model model) {
		return modelRepository.save(model);
	}

}
