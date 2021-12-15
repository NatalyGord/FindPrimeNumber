package com.example.primenumber.services;

import com.example.primenumber.models.Prime;
import com.example.primenumber.repository.PrimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrimeService {
    @Autowired
    private final PrimeRepository primeRepository;

    public PrimeService(PrimeRepository primeRepository) {
        this.primeRepository = primeRepository;
    }

    public List<Prime> getAllPrimes() {  //получить все
        return primeRepository.findAll();
    }

    public Prime createPrime(int x) {      //Создать
        Prime prime = new Prime(x);
        return primeRepository.save(prime);
    }

    public List<Prime> findByRequested_x(int requested_x) {  //найти все по requested_x
        return primeRepository.findByRequested_x(requested_x);
    }
}
