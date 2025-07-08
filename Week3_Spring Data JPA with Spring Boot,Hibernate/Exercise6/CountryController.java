package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public Country create(@RequestBody CountryRequest request) {
        return countryService.createCountryWithCities(
                request.getCountryCode(),
                request.getName(),
                request.getCities()
        );
    }

    @GetMapping
    public List<Country> getAll() {
        return countryService.getAllCountries();
    }
}
