package com.project.pp.Service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    int size = 1000000;
    int a = 5;
    int b = 5;
    int lim = 2;
    int max = 3;

    public double oneLine() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            double x = a * (lim / max) * b;
            double y = a * (lim / max) * b;
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

    public double twoLine() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            double depth = a * (lim / max);
            double x = depth * b;
            double y = depth * b;
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

}
