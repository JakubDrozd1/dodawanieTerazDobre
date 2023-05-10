package com.example.dodawanieterazdobre;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DodawanieTerazDobreApplicationTests {

    @Test
    void dodawanie() {
        DodawanieTerazDobreApplication dodawanieTerazDobreApplication= new DodawanieTerazDobreApplication();
        assertEquals(10,dodawanieTerazDobreApplication.dodawanie(5,5));
    }

}
