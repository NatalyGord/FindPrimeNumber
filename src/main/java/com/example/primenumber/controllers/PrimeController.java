package com.example.primenumber.controllers;

import com.example.primenumber.models.Prime;
import com.example.primenumber.services.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class PrimeController {
    @Autowired
    private PrimeService primeService;

    @GetMapping("/primes")   //получить все
    public List<Prime> getAllPrimes(){
        return primeService.getAllPrimes();
    }

    @GetMapping("/{requested_x}")   //создать
    public Prime createPrime(@PathVariable(value = "requested_x") int requested_x){
        if(primeService.findByRequested_x(requested_x).isEmpty()) {
            return primeService.createPrime(requested_x);
        }
        else {
            return primeService.findByRequested_x(requested_x).get(0);
        }
    }
}
