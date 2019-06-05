package com.project.pp.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArrayListService {

    List<Integer> list = Arrays.asList(new Integer[100000]);

    public ArrayListService() {
        for (int i = 0; i < list.size(); i++) {
            list.add(i);
        }
    }

    // ~1,500 op/s
    public double testStream() {
        long start = System.nanoTime();
        List<String> collect = list
                .stream()
                .filter(s -> s > 5)
                .map(s -> "Value: " + s)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }

    // ~1,500 op/s
    public double testFor() {
        long start = System.nanoTime();
        ArrayList<String> results = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int s = list.get(i);
            if (s > 5) {
                results.add("Value: " + s);
            }
        }
        results.sort(String::compareTo);
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;

    }

    // ~8,000 op/s
    public double testStreamParrallel() {
        long start = System.nanoTime();
        List<String> collect = list
                .stream()
                .parallel()
                .filter(s -> s > 5)
                .map(s -> "Value: " + s)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        long finish = System.nanoTime();
        return ((double) (finish - start)) / 1000000;
    }
}
