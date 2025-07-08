package com.example.demo.service;

import com.example.demo.model.Country;
import java.util.List;
import java.util.Optional;

public interface CountryService {
    Optional<Country> findByNameUsingHQL(String name);
    List<Country> findWithCapitalLengthGreaterThan(int length);
}
