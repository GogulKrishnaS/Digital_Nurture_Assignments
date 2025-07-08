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

    @GetMapping("/hql/{name}")
    public Country getByHQL(@PathVariable String name) {
        return countryService.findByNameUsingHQL(name).orElseThrow();
    }

    @GetMapping("/capital-length/{length}")
    public List<Country> getByCapitalLength(@PathVariable int length) {
        return countryService.findWithCapitalLengthGreaterThan(length);
    }
}
