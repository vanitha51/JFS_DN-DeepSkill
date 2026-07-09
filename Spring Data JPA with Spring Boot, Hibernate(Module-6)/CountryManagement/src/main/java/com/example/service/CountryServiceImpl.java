package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.entity.State;
import com.example.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    CountryRepository repository;

    @Override
    public Country saveCountry(Country country) {

        if (country.getStates() != null) {
            for (State state : country.getStates()) {
                state.setCountry(country);
            }
        }

        return repository.save(country);
    }

    @Override
    public List<Country> getAllCountries() {
        return repository.findAll();
    }
    @Override
    public Country getCountryByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Country getCountryByCapital(String capital) {
        return repository.findByCapital(capital);
    }

    @Override
    public List<Country> getCountriesStartingWith(String prefix) {
        return repository.findByNameStartingWith(prefix);
    }

    @Override
    public List<Country> getCountriesContaining(String word) {
        return repository.findByNameContaining(word);
    }
    @Override
    public Country getCountryByNameHQL(String name) {
        return repository.findCountryByNameHQL(name);
    }

    @Override
    public Country getCountryByCapitalNative(String capital) {
        return repository.findCountryByCapitalNative(capital);
    }
}
