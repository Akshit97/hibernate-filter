package com.example.learning.hibernatefilter.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
@FilterDef(name = "countryFilter", parameters = @ParamDef(name="country", type = "java.lang.String"))
@Filter(name = "countryFilter", condition = "country = :country")
@Getter
@Setter
@org.hibernate.annotations.NamedNativeQuery(name="User.findUsersByNamedSQLQuery",
        query = "select * from user_table where name = ? and REGEXP_LIKE(name, '^[[:digit:]]+$')",
resultClass = User.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String country;

    private String email;

    // Other fields
}