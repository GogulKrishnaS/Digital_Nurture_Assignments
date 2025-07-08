package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    public City() {}

    public City(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    // getters and setters omitted for brevity
}
