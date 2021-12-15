package com.example.primenumber.services;

import com.example.primenumber.models.Prime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class PrimeServiceTest {

    @Test
    public void createPrime() {
        int x = 3;
        Prime prime = new Prime(x);

        assertEquals(prime.getPrime_number(), Prime.findingSmallerPrime(x));
    }
    @Test
    public void createPrime2() {
        int x = 30;
        Prime prime = new Prime(x);

        assertEquals(prime.getPrime_number(), Prime.findingSmallerPrime(x));
    }
    @Test
    public void createPrime3() {
        int x = 186;
        Prime prime = new Prime(x);

        assertEquals(prime.getPrime_number(), Prime.findingSmallerPrime(x));
    }
    @Test
    public void createPrime4() {
        int x = 427;
        Prime prime = new Prime(x);

        assertEquals(prime.getPrime_number(), Prime.findingSmallerPrime(x));
    }
    @Test
    public void createPrime5() {
        int x = 1469;
        Prime prime = new Prime(x);

        assertEquals(prime.getPrime_number(), Prime.findingSmallerPrime(x));
    }

    @Test
    public void createPrime6() {
        int x = 1469;
        Prime prime = new Prime(x);

        assertEquals(prime.getRequested_x(), x);
    }
}