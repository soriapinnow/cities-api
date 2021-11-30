package com.pinnow.citiesapi;

import com.pinnow.citiesapi.countries.Country;
import com.pinnow.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/countries")
public class CountryResource {


    private CountryRepository repository;
    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }
        @GetMapping
        public List<Country> countries () {
            return repository.findAll();
        }
}
