package com.twu.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FizzBuzzTest {

    private Console console;
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        console = mock(Console.class);
        fizzBuzz = new FizzBuzz(console);
    }

    @Test
    public void should_print_continuous_number_from_1_to_15() throws Exception {

        fizzBuzz.printNumber(15);

        verify(console).print("1");
        verify(console).print("2");
        verify(console).print("3");
        verify(console).print("4");
        verify(console).print("5");
        verify(console).print("6");
        verify(console).print("7");

    }
}
