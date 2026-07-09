package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CountryCode;

@RestController
public class HelloController {

    List<CountryCode> countries = new ArrayList<>();

    public HelloController() {
        countries.add(new CountryCode("IN", "India", "New Delhi"));
        countries.add(new CountryCode("US", "United States", "Washington D.C."));
        countries.add(new CountryCode("UK", "United Kingdom", "London"));
    }

    @GetMapping("/country/{code}")
    public CountryCode getCountry(@PathVariable("code") String code) {

        for (CountryCode country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}