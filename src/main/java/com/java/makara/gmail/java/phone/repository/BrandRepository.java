package com.java.makara.gmail.java.phone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.makara.gmail.java.phone.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
