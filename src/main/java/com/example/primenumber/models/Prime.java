package com.example.primenumber.models;

import javax.persistence.*;

@Entity
@Table(name = "primes")
public class Prime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;

    @Column(name = "requested_x", nullable = false)
    private int requested_x;
    @Column(name = "prime_number", nullable = false)
    private int prime_number;

    public Prime(){
    }
    public Prime(int requested_x) {
        this.requested_x = requested_x;
        this.prime_number = Prime.findingSmallerPrime(requested_x);
    }

    public Long getId() {
        return Id;
    }

    public int getRequested_x() {
        return requested_x;
    }

    public void setRequested_x(int requested_x) {
        this.requested_x = requested_x;
    }

    public int getPrime_number() {
        return prime_number;
    }

    public static int findingSmallerPrime(int x) {
        if(x <= 2) {
            return -1;
        }
        else {
            int num = x - 1;
            if(num == 2){
                return num;
            }
            else {
                boolean result = false;
                for (int i = 0; i < x - 1; i++) {
                    for (int j = 2; j < num; j++) {
                        if (num % j == 0) {
                            result = false;
                            break;
                        } else {
                            result = true;
                        }
                    }
                    if (result) {
                        break;
                    } else {
                        num--;
                    }
                }
            }
            return num;
        }
    }
}
