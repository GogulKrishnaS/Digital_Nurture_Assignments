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

    @GetMapping("/name/{name}")
    public Country getByName(@PathVariable String name) {
        return countryService.findByName(name).orElseThrow();
    }

    @GetMapping("/capital-contains/{fragment}")
    public List<Country> getByCapitalContaining(@PathVariable String fragment) {
        return countryService.findByCapitalContaining(fragment);
    }

    @GetMapping("/name-starts/{prefix}")
    public List<Country> getByNameStartingWith(@PathVariable String prefix) {
        return countryService.findByNameStartingWith(prefix);
    }

    @GetMapping("/code/{code}")
    public Country getByCountryCode(@PathVariable String code) {
        return countryService.findByCountryCodeIgnoreCase(code).orElseThrow();
    }

    @GetMapping("/name-or-capital/{name}/{capital}")
    public List<Country> getByNameOrCapital(@PathVariable String name,
                                            @PathVariable String capital) {
        return countryService.findByNameOrCapital(name, capital);
    }

    @GetMapping("/code-length-gt/{length}")
    public List<Country> getByCountryCodeLength(@PathVariable int length) {
        return countryService.findByCountryCodeLengthGreaterThan(length);
    }
}
