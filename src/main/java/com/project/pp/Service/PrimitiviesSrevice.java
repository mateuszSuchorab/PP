package com.project.pp.Service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class PrimitiviesSrevice {

    int size = 1000000;

    public double simpleInteger() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            int a = 0;
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

    public double classInteger() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            Integer a = 0;
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

    public double classBigDecimal() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            BigDecimal a = BigDecimal.ZERO;
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

    public double classBigInteger() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            BigInteger a = BigInteger.ZERO;
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }
}
