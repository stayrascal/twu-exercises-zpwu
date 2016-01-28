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
}
