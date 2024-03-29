package com.ncoderslab;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStream {
    public static void main(String[] args) {
        //2.4. Stream.builder()
        Stream<String> streamBuilder = Stream.<String>builder()
                .add("Sumanta")
                .add("Kumar")
                .add("Ghosh")
                .build();
        String name = streamBuilder.collect(Collectors.joining(" ", "Mr. ", ""));
        System.out.println(name);

        //2.5. Stream.generate()

        int[] nums = {8, 5, 3, 20, 5, 2, 4, 3, 4, 6};
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length - 1 - j; i++) {
                if (nums[i] > nums[i + 1]) {
                    //swap number
                    int tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::print);
    }


}
