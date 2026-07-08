package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepository repository;

    @Override
    public Country saveCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public List<Country> getAllCountries() {
        return repository.findAll();
    }
}