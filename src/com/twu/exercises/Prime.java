package com.twu.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prime {


    public List<Integer> generate(int number) {
        return number < 1 ? Collections.emptyList() : getFactors(number);
    }

    private List<Integer> getFactors(final int number) {
        List<Integer> factors = new ArrayList<>();
        for (int index = 2, compositeNumber = number; index <= number && compositeNumber != 1; index++) {
            if (compositeNumber % index == 0) {
                factors.add(index);
                compositeNumber /= index;
                index--;
            }
        }
        return factors;
    }
}
