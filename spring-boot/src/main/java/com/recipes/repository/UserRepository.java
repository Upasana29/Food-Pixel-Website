package com.recipes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipes.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public Optional<User> findByEmail(String username);


}
