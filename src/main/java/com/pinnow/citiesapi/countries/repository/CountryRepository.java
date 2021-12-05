package com.pinnow.citiesapi.countries.repository;

import com.pinnow.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
