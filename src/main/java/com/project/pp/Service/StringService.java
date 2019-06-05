package com.project.pp.Service;

import org.springframework.stereotype.Service;

@SuppressWarnings("Duplicates")
@Service
public class StringService {

    int size = 100000;
    String a = "5";
    String b = "5";

    public double addStrings() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            String result = "";
            result = a + b;
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

    public double stringBuilder() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            StringBuilder result = new StringBuilder();
            result.append(a);
            result.append(b);
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

    public double addMultipleStrings() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            String result = "";
            result = a + b + a + b + a + b + a + b + a + b;
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

    public double addMultipleStringsNotOneRow() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            String result = "";
            result = result + a;
            result = result + b;
            result = result + a;
            result = result + b;
            result = result + a;
            result = result + b;
            result = result + a;
            result = result + b;
            result = result + a;
            result = result + b;
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

    public double stringBuilderMultiple() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            StringBuilder result = new StringBuilder();
            result.append(a);
            result.append(b);
            result.append(a);
            result.append(b);
            result.append(a);
            result.append(b);
            result.append(a);
            result.append(b);
            result.append(a);
            result.append(b);
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

}
