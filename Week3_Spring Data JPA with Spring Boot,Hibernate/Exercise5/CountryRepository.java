package com.example.demo.repository;

import com.example.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {

    // Find by exact name
    Optional<Country> findByName(String name);

    // Find all countries where capital contains some letters (case-sensitive)
    List<Country> findByCapitalContaining(String capitalFragment);

    // Find all countries whose name starts with a given prefix
    List<Country> findByNameStartingWith(String prefix);

    // Find by country code ignoring case
    Optional<Country> findByCountryCodeIgnoreCase(String countryCode);

    // Find countries where name or capital matches
    List<Country> findByNameOrCapital(String name, String capital);

    // Find countries with countryCode length > 2 (using JPQL)
    List<Country> findByCountryCodeLengthGreaterThan(int length);
}
