package com.example.demo.service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Optional<Country> findByNameUsingHQL(String name) {
        return countryRepository.findCountryByNameHQL(name);
    }

    @Override
    public List<Country> findWithCapitalLengthGreaterThan(int length) {
        return countryRepository.findCountriesWithCapitalLengthGreaterThan(length);
    }
}
