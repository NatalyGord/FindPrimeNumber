package com.example.primenumber.repository;

import com.example.primenumber.models.Prime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PrimeRepository extends JpaRepository<Prime, Long> {

    //найти все по requested_x
    @Query(value = "SELECT * FROM primes WHERE requested_x = ?", nativeQuery = true)
    List <Prime> findByRequested_x(int requested_x);

    @Query(value = "SELECT * FROM primes", nativeQuery = true)
    List<Prime> findAll();

}
