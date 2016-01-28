package com.twu.exercises;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeTest {

    @Test
    public void should_return_empty_list_when_factor_one() throws Exception {

        Prime prime = new Prime();
        List<Integer> primeList = prime.generate(1);
        assertEquals(primeList.size(), 0);
    }

    @Test
    public void should_return_a_list_contains_2_3_5_when_factor_30() throws Exception {
        Prime prime = new Prime();

        List<Integer> primeList = prime.generate(30);

        assertEquals(primeList.size(), 3);
        assertEquals(primeList.get(0), Integer.valueOf(2));
        assertEquals(primeList.get(1), Integer.valueOf(3));
        assertEquals(primeList.get(2), Integer.valueOf(5));

    }

    @Test
    public void should_return_empty_list_when_factor_negative_number() throws Exception {
        Prime prime = new Prime();
        List<Integer> primeList = prime.generate(-91);
        assertEquals(primeList.size(), 0);
    }

    @Test
    public void shoud_return_a_list_which_size_is_one_when_factor_seven() throws Exception {
        Prime prime = new Prime();
        List<Integer> primeList = prime.generate(7);

        assertEquals(primeList.size(), 1);
        assertEquals(primeList.get(0), Integer.valueOf(7));
    }

    @Test
    public void should_return_a_list_which_contains_2_3_3_when_factor_18() throws Exception {
        Prime prime = new Prime();
        List<Integer> primeList = prime.generate(18);

        assertEquals(primeList.size(), 3);
        assertEquals(primeList.get(0), Integer.valueOf(2));
        assertEquals(primeList.get(1), Integer.valueOf(3));
        assertEquals(primeList.get(2), Integer.valueOf(3));

    }
}
