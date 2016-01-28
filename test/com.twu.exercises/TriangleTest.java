package com.twu.exercises;


import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TriangleTest {

    private Triangle triangle;
    private Console console;

    @Before
    public void setUp() throws Exception {
        console = mock(Console.class);
        triangle = new Triangle(console);
    }

    @Test
    public void should_print_one_asterisk() throws Exception {

        triangle.printOneAsterisk();

        verify(console).print("*");
    }
}
