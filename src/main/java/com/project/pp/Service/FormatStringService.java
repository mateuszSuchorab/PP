package com.project.pp.Service;

import org.springframework.stereotype.Service;

@Service
public class FormatStringService {

    int size = 100000;
    String foo = "foo";

    public double stringFormat() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            String formattedString = String.format("%s = %d", foo, 2);
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

    public double stringConcat() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            String concattedString = foo + " = " + 2;
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }
}
