package com.example.learning.hibernatefilter.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

@Entity
@Table(name = "user_table")
@FilterDef(name = "countryFilter", parameters = @ParamDef(name="country", type = String.class))
@Filter(name = "countryFilter", condition = "country = :country")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String country;

    private String email;

    // Other fields
}