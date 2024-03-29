package com.ncoderslab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(arr);
        //intStream.forEach(System.out::println);
        Stream<int[]> stream = Stream.of(arr);
        //stream.flatMapToInt(Arrays::stream).forEach(System.out::println);
        System.out.println("========================");
        long count = intStream.count();
        System.out.println(count);
        IntStream str1 = Arrays.stream(arr, 0, 3);
        System.out.println("========================");
        str1.forEach(System.out::println);

        Stream<Integer> intNum = Stream.of(1, 2, 3, 4, 6);

    }
    public static <T> Object[] convertStreamToArray(Stream<T> stream){
        return stream.toArray();
    }
}