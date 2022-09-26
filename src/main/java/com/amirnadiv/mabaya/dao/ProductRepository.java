package com.amirnadiv.mabaya.dao;

import com.amirnadiv.mabaya.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByPublished(boolean published);

    List<Product> findByTitleContaining(String title);
}