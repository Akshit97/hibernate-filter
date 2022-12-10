package com.example.learning.hibernatefilter.repository;

import com.example.learning.hibernatefilter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
}