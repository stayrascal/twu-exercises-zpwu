package com.twu.exercises;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class FizzBuzzTest {

    private Console console;
    private FizzBuzz fizzBuzz;
    private InOrder inOrder;

    @Before
    public void setUp() throws Exception {
        console = mock(Console.class);
        inOrder = inOrder(console);
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

    @Test
    public void the_fizz_or_buzz_should_replace_the_number_which_can_divisible_by_three_or_five_from_1_to_15() throws Exception {
        fizzBuzz.printNumberWithFizzAndBuzz(15);

        inOrder.verify(console, times(1)).print("1");
        inOrder.verify(console, times(1)).print("2");
        inOrder.verify(console, times(1)).print("Fizz");
        inOrder.verify(console, times(1)).print("4");
        inOrder.verify(console, times(1)).print("Buzz");
        inOrder.verify(console, times(1)).print("Fizz");
        inOrder.verify(console, times(1)).print("7");
        inOrder.verify(console, times(1)).print("8");
        inOrder.verify(console, times(1)).print("Fizz");
        inOrder.verify(console, times(1)).print("Buzz");
        inOrder.verify(console, times(1)).print("11");
        inOrder.verify(console, times(1)).print("Fizz");
        inOrder.verify(console, times(1)).print("13");
        inOrder.verify(console, times(1)).print("14");
        inOrder.verify(console, times(1)).print("FizzBuzz");

    }
}
