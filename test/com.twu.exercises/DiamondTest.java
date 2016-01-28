package com.twu.exercises;


import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DiamondTest {

    private Console console;
    private Diamond diamond;

    @Before
    public void setUp() throws Exception {
        console = mock(Console.class);
        diamond = new Diamond(console);
    }

    @Test
    public void should_print_a_centered_triangle_which_hight_is_3() throws Exception {
        diamond.printIsoscelesTriangle(3);

        verify(console).print("    *");
        verify(console).print("  ***");
        verify(console).print("*****");

    }
}
