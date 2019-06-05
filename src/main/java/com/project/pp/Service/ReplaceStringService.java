package com.project.pp.Service;

import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

@Service
public class ReplaceStringService {
    int size = 100000;
    String a = "5";
    String b = "5";

    public double stringReplace() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            a.replace(a, b);
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

    public double superStringReplace() {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            StringUtils.replace(a, a, b);
        }
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }


}
