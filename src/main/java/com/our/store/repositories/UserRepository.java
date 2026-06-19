package com.our.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.our.store.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
