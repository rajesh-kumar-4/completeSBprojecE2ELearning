package src.main.java.Leetcode;

import javax.xml.transform.stream.StreamSource;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8P01 {
    public static void main(String[] args) {

        /* When numbers are given as Array */
       /* int[] arr = {10,15,8,49,25,98,32};

        Map<Boolean, List<Integer>> list = Arrays.stream(arr).boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(list);*/

/*
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max =  myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);

        *//* or we can try using below way *//*
        *//* When numbers are given as Array i*//*
       int[] arr = {10,15,8,49,25,98,98,32,15};

        Integer maxdata = Arrays.stream(arr).boxed()
                .max(Comparator.naturalOrder()).get();
                       // .max(Integer::compare).get();

        System.out.println(maxdata);
    }*/


        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        int[] reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();

        System.out.println("1  : "+Arrays.toString(reversedArray));
        System.out.println("2  : ");

        List<Integer> collect = Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println("3  : "+collect);

    }
}
