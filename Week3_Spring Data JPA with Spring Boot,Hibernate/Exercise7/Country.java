package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String capital;

    @Column(unique = true)
    private String countryCode;

    // Constructors, Getters, Setters omitted for brevity
}
