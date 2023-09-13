package com.java.makara.gmail.java.phone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.makara.gmail.java.phone.dto.ModelDTO;
import com.java.makara.gmail.java.phone.entity.Model;
import com.java.makara.gmail.java.phone.mapper.ModelMapper;
import com.java.makara.gmail.java.phone.service.ModelService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/models")
public class ModelController {
	private final ModelService modelService;
	private final ModelMapper modelMapper;
	

	@PostMapping
	public ResponseEntity<?> create(@RequestBody ModelDTO modelDTO){
		Model model = modelMapper.toModel(modelDTO);
		model = modelService.save(model);
		return ResponseEntity.ok(modelMapper.toModelDTO(model));
	}
}