package com.our.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.our.store.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
