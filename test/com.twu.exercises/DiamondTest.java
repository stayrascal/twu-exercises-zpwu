package com.twu.exercises;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class DiamondTest {

    private Console console;
    private Diamond diamond;
    private InOrder inOrder;


    @Before
    public void setUp() throws Exception {
        console = mock(Console.class);
        inOrder = inOrder(console);
        diamond = new Diamond(console);
    }

    @Test
    public void should_print_a_centered_triangle_which_hight_is_3() throws Exception {
        diamond.printIsoscelesTriangle(3);

        verify(console).print("    *");
        verify(console).print("  ***");
        verify(console).print("*****");
    }

    @Test
    public void should_print_a_centered_diamond_which_side_length_is_3() throws Exception {
        diamond.printDiamond(3);

        inOrder.verify(console, times(1)).print("    *");
        inOrder.verify(console, times(1)).print("  ***");
        inOrder.verify(console, times(1)).print("*****");
        inOrder.verify(console, times(1)).print("  ***");
        inOrder.verify(console, times(1)).print("    *");

    }
}
