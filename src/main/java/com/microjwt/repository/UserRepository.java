package com.microjwt.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.microjwt.model.User;

public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findByUsername(String username);
}
