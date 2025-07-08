package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String capital;

    @Column(unique = true)
    private String countryCode;

    public Country() {
    }

    public Country(String name, String capital, String countryCode) {
        this.name = name;
        this.capital = capital;
        this.countryCode = countryCode;
    }

    // Getters & setters omitted for brevity
}

