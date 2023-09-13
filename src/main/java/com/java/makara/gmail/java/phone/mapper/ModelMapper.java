package com.java.makara.gmail.java.phone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.java.makara.gmail.java.phone.dto.ModelDTO;
import com.java.makara.gmail.java.phone.entity.Model;
import com.java.makara.gmail.java.phone.service.BrandService;

@Mapper( componentModel = "spring", uses = {BrandService.class})
public interface ModelMapper {
	ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);
	
	@Mapping(target = "brand", source = "brandId")
	Model toModel(ModelDTO dto);
	
	@Mapping(target = "brandId", source = "brand.id")
	ModelDTO toModelDTO(Model model);
	
	/*
	default Brand toBrand(Integer brId) {
		Brand brand = new Brand();
		brand.setId(brId);
		return brand;
	}
	*/
}
