package com.project.pp.Service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("Duplicates")
@Service
public class LoopService {

    List<Integer> list = Arrays.asList(new Integer[10000000]);


    public long simpleFor() {
        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            boolean flag = false;
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public long simpleForeach() {
        long start = System.nanoTime();
        for (Integer value : list) {
            boolean flag = false;

        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public long foreachJavaEight() {
        long start = System.nanoTime();
        list.forEach(value -> {
            boolean flag = false;

        });
        long finish = System.nanoTime();
        return finish - start;
    }

    public long simpleWhile() {
        long start = System.nanoTime();
        int i = 0;
        while (i < list.size()) {
            boolean flag = false;
            i++; // ? XD
        }
        long finish = System.nanoTime();
        return finish - start;
    }

}
