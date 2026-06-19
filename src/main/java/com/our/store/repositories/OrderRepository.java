package com.our.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.our.store.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
