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

    @GetMapping
    public List<Country> getAll() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{id}")
    public Country getById(@PathVariable Long id) {
        return countryService.getCountryById(id).orElseThrow();
    }

    @PostMapping
    public Country create(@RequestBody Country country) {
        return countryService.createCountry(country);
    }

    @PutMapping("/{id}")
    public Country update(@PathVariable Long id, @RequestBody Country country) {
        return countryService.updateCountry(id, country);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        countryService.deleteCountry(id);
    }

    @GetMapping("/code/{countryCode}")
    public Country getByCountryCode(@PathVariable String countryCode) {
        return countryService.getCountryByCode(countryCode).orElseThrow();
    }
}
