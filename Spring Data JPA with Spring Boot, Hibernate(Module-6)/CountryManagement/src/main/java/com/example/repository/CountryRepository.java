package com.example.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Country;
import java.util.*;

public interface CountryRepository extends JpaRepository<Country, Long> {
	Country findByName(String name);


    Country findByCapital(String capital);


    List<Country> findByNameStartingWith(String prefix);

    
    List<Country> findByNameContaining(String word);
    @Query("SELECT c FROM Country c WHERE c.name = :name")
    Country findCountryByNameHQL(@Param("name") String name);
    
    @Query(value = "SELECT * FROM country WHERE capital = :capital", nativeQuery = true)
    Country findCountryByCapitalNative(@Param("capital") String capital);
}