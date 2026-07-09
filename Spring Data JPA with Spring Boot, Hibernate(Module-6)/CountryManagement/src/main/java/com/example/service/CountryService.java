package com.example.service;

import java.util.List;
import com.example.entity.Country;

public interface CountryService {

    Country saveCountry(Country country);

    List<Country> getAllCountries();

	Country getCountryByName(String name);
	
	Country getCountryByCapital(String capital);
	
	List<Country> getCountriesStartingWith(String prefix);
	
	List<Country> getCountriesContaining(String word);
	Country getCountryByNameHQL(String name);
	
	Country getCountryByCapitalNative(String capital);
}