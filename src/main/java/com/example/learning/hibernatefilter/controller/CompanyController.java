package com.example.learning.hibernatefilter.controller;

import com.example.learning.hibernatefilter.model.Company;
import com.example.learning.hibernatefilter.model.User;
import com.example.learning.hibernatefilter.service.CompanyService;
import com.example.learning.hibernatefilter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/company")
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> findById(@PathVariable Long id) {
        Optional<Company> company = companyService.findById(id);
        if (company.isPresent()) {
            return ResponseEntity.ok(company.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Company> save(@RequestBody Company company) {
        Company savedCompany = companyService.save(company);
        return ResponseEntity.ok(savedCompany);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        companyService.delete(id);
    }
}
