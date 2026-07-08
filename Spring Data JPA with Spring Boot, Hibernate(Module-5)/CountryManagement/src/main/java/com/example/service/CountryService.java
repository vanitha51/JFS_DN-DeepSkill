package com.example.service;

import java.util.List;
import com.example.entity.Country;

public interface CountryService {

    Country saveCountry(Country country);

    List<Country> getAllCountries();
}