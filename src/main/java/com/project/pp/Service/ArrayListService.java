package com.project.pp.Service;

import org.springframework.stereotype.Service;

@Service
public class ArrayListService {

//    // ~1,500 op/s
//    public void testStream(ArrayState state) {
//        List<String> collect = state.testList
//                .stream()
//                .filter(s -> s.length() > 5)
//                .map(s -> "Value: " + s)
//                .sorted(String::compareTo)
//                .collect(Collectors.toList());
//    }
//
//    // ~1,500 op/s
//    public void testFor(ArrayState state) {
//        ArrayList<String> results = new ArrayList<>();
//
//        for (int i = 0;i < state.testList.size();i++) {
//            String s = state.testList.get(i);
//
//            if (s.length() > 5) {
//                results.add("Value: " + s);
//            }
//        }
//
//        results.sort(String::compareTo);
//    }
//
//    // ~8,000 op/s
//// Note, with an array size of 10,000 and more variable load on my CPU this was 1/3rd as fast as testStream
//    public void testStreamParrallel(ArrayState state) {
//        List<String> collect = state.testList
//                .stream()
//                .parallel()
//                .filter(s -> s.length() > 5)
//                .map(s -> "Value: " + s)
//                .sorted(String::compareTo)
//                .collect(Collectors.toList());
//    }



}
