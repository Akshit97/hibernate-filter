package com.example.learning.hibernatefilter.repository;

import com.example.learning.hibernatefilter.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}