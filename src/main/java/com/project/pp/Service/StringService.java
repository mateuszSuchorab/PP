package com.project.pp.Service;

import org.springframework.stereotype.Service;

@SuppressWarnings("Duplicates")
@Service
public class StringService{


    public long buildString() {
        long start = System.nanoTime();
        for (int i = 0 ;i < 1000 ;i ++){
            String a = "5";
            String b = "5";
            String c = "5";
            String d = "5";
            String e = "5";
            String result = a + b + c + d + e;
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    public long buildStringTwo() {
        long start = System.nanoTime();
        for (int i = 0 ;i < 1000 ;i ++){
            String a = "5";
            String b = "5";
            String c = "5";
            String d = "5";
            String e = "5";
            StringBuilder  result = new StringBuilder();
            result.append(a);
            result.append(b);
            result.append(c);
            result.append(d);
            result.append(e);
        }
        long finish = System.nanoTime();
        return finish - start;
    }
    public long buildStringThree() {
        long start = System.nanoTime();
        for (int i = 0 ;i < 1000 ;i ++){
            String a = "5",b = "5",c = "5",d = "5",e = "5";
            StringBuilder  result = new StringBuilder();
            result.append(a);
            result.append(b);
            result.append(c);
            result.append(d);
            result.append(e);
        }
        long finish = System.nanoTime();
        return finish - start;
    }
}
