package com.twu.exercises;


import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
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

    @Test
    public void shoud_print_8_asterisk_on_one_line() throws Exception {

        triangle.printAHorizontalLine(8);

        verify(console).print("********");
    }

    @Test
    public void should_print_3_asterisk_on_one_row() throws Exception {
        triangle.printAVerticalLine(3);

        verify(console, times(3)).print("*");
    }

    @Test
    public void should_print_a_right_trangle() throws Exception {
        triangle.printRightTriangle(3);

        verify(console).print("*");
        verify(console).print("**");
        verify(console).print("***");

    }
}
