package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.model.Country;
import com.example.demo.repository.CityRepository;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CityRepository cityRepository;

    public Country createCountryWithCities(String code, String name, List<String> cities) {
        Country country = new Country(code, name);
        country = countryRepository.save(country);

        for (String cityName : cities) {
            City city = new City(cityName, country);
            cityRepository.save(city);
        }
        return country;
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
