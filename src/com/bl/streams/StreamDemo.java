package com.bl.streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
        public static void main(String[] args) {


            List<Integer> list = new ArrayList<Integer>();
            list.add(12);
            list.add(23);
            list.add(34);
            list.add(56);
            list.add(78);

            List<Integer> list1 = list.stream().filter(p -> p > 12 && p == 56).collect(Collectors.toList());
            System.out.println(list1);

        }
    }

