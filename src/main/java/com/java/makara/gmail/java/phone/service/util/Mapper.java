package com.java.makara.gmail.java.phone.service.util;

import com.java.makara.gmail.java.phone.dto.BrandDTO;
import com.java.makara.gmail.java.phone.entity.Brand;

public class Mapper {
	public static Brand toBrand(BrandDTO dto) {
		Brand brand = new Brand();
		brand.setId(dto.getId());
		brand.setName(dto.getName());
		return brand;
	}
}
