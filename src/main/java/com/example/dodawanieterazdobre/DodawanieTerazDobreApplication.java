package com.example.dodawanieterazdobre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DodawanieTerazDobreApplication {

    public static void main(String[] args) {
        SpringApplication.run(DodawanieTerazDobreApplication.class, args);
    }
    public double dodawanie(double a, double b){
        return a+b;
    }
}
