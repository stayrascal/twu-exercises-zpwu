package com.twu.exercises;

import java.util.ArrayList;
import java.util.List;

public class Prime {


    public List<Integer> generate(final int number) {
        List<Integer> factors = new ArrayList<>();
        if (number <= 1){
            return factors;
        }

        for (int i = 2, compositeNumber = number; i <= Math.sqrt(number); i++){
            if (compositeNumber % i == 0){
                factors.add(i);
                compositeNumber /= i;
            }
            if (compositeNumber == 1){
                break;
            }
        }
        return factors;
    }
}
