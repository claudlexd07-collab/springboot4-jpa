package com.our.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.our.store.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
