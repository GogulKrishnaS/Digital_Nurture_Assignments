package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String countryCode;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<City> cities;

    public Country() {}

    public Country(String countryCode, String name) {
        this.countryCode = countryCode;
        this.name = name;
    }

    // getters and setters omitted for brevity
}
