package com.example.demo.service;

import com.example.demo.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    List<Country> getAllCountries();
    Optional<Country> findByName(String name);
    List<Country> findByCapitalContaining(String fragment);
    List<Country> findByNameStartingWith(String prefix);
    Optional<Country> findByCountryCodeIgnoreCase(String code);
    List<Country> findByNameOrCapital(String name, String capital);
    List<Country> findByCountryCodeLengthGreaterThan(int length);
}
