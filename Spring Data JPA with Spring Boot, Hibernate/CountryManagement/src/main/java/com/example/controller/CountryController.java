package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Country;
import com.example.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    CountryService service;

    @PostMapping("/save")
    public Country save(@RequestBody Country country) {
        return service.saveCountry(country);
    }

    @GetMapping("/all")
    public List<Country> all() {
        return service.getAllCountries();
    }
}