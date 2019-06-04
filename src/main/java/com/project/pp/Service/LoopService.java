package com.project.pp.Service;

import com.project.pp.Model.FakeData;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("Duplicates")
@Service
public class LoopService {

    List<Integer> list = Arrays.asList(new Integer[10000000]);


    public double simpleFor() {
        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            FakeData f = new FakeData(1, false, "dsadsadffffffffffffffffffffASdas"+1);
        }
        long finish = System.nanoTime();
        return ((double)(finish - start))/1000000;
    }

    public double simpleForeach() {
        long start = System.nanoTime();
        for (Integer i : list) {
            FakeData f = new FakeData(1, false, "dsadsadffffffffffffffffffffASdas" + 1);
        }
        long finish = System.nanoTime();
        return ((double)(finish - start))/1000000;
    }

    public double foreachJavaEight() {
        long start = System.nanoTime();
        list.forEach(i -> {
            FakeData f = new FakeData(1, false, "dsadsadffffffffffffffffffffASdas" + 1);
        });
        long finish = System.nanoTime();
        return ((double)(finish - start))/1000000;
    }

    public double simpleWhile() {
        long start = System.nanoTime();
        int i = 0;
        while (i < list.size()) {
            FakeData f = new FakeData(1, false, "dsadsadffffffffffffffffffffASdas" + 1);
            i++;
        }
        long finish = System.nanoTime();
        return ((double)(finish - start))/1000000;
    }

}
