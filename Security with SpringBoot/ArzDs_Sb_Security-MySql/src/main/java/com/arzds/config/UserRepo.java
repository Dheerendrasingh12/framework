package com.arzds.config;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arzds.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String userName);

}
