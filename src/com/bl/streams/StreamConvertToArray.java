package com.bl.streams;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConvertToArray {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();

        l.add(1);
        l.add(1);
        l.add(0);
        l.add(1);
        l.add(0);
        l.add(1);

        List<Integer> list1 = l.stream().sorted().collect(Collectors.toList());
        List<Integer> list2 = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(list1);
    }
}
