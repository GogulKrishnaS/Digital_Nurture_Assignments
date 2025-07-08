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
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findByName(String name) {
        return countryRepository.findByName(name);
    }

    @Override
    public List<Country> findByCapitalContaining(String fragment) {
        return countryRepository.findByCapitalContaining(fragment);
    }

    @Override
    public List<Country> findByNameStartingWith(String prefix) {
        return countryRepository.findByNameStartingWith(prefix);
    }

    @Override
    public Optional<Country> findByCountryCodeIgnoreCase(String code) {
        return countryRepository.findByCountryCodeIgnoreCase(code);
    }

    @Override
    public List<Country> findByNameOrCapital(String name, String capital) {
        return countryRepository.findByNameOrCapital(name, capital);
    }

    @Override
    public List<Country> findByCountryCodeLengthGreaterThan(int length) {
        return countryRepository.findByCountryCodeLengthGreaterThan(length);
    }
}
