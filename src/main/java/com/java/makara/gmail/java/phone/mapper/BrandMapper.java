package com.java.makara.gmail.java.phone.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.java.makara.gmail.java.phone.dto.BrandDTO;
import com.java.makara.gmail.java.phone.entity.Brand;

@Mapper
public interface BrandMapper {
	
	BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);
	
	Brand toBrand(BrandDTO dto);
	BrandDTO toBrandDTO(Brand entity);
}
