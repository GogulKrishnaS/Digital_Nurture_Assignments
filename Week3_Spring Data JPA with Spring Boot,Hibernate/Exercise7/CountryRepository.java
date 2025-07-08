package com.example.demo.repository;

import com.example.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {

    // HQL / JPQL Query
    @Query("SELECT c FROM Country c WHERE c.name = :name")
    Optional<Country> findCountryByNameHQL(@Param("name") String name);

    // Native SQL Query
    @Query(value = "SELECT * FROM country WHERE LENGTH(capital) > :length", nativeQuery = true)
    List<Country> findCountriesWithCapitalLengthGreaterThan(@Param("length") int length);

}
