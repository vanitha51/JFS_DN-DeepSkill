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
    @GetMapping("/name/{name}")
    public Country getCountryByName(@PathVariable String name) {
        return service.getCountryByName(name);
    }

    @GetMapping("/capital/{capital}")
    public Country getCountryByCapital(@PathVariable String capital) {
        return service.getCountryByCapital(capital);
    }

    @GetMapping("/startswith/{prefix}")
    public List<Country> getCountriesStartingWith(@PathVariable String prefix) {
        return service.getCountriesStartingWith(prefix);
    }

    @GetMapping("/contains/{word}")
    public List<Country> getCountriesContaining(@PathVariable String word) {
        return service.getCountriesContaining(word);
    }
    @GetMapping("/hql/{name}")
    public Country getCountryByNameHQL(@PathVariable String name) {
        return service.getCountryByNameHQL(name);
    }

    @GetMapping("/native/{capital}")
    public Country getCountryByCapitalNative(@PathVariable String capital) {
        return service.getCountryByCapitalNative(capital);
    }
}