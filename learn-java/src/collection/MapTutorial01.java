package collection;

import java.util.*;
import java.util.HashMap;

public class MapTutorial01 {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<Integer, String>();
        names.put(105, "Sumanta");
        names.put(101, "Santosh");
        names.put(103, "Chhanda");
        names.put(102, "Jisu");

        //print all map values
        printHeader("Print all map values");
        for (Map.Entry m : names.entrySet()) {
            System.out.println("Index is " + m.getKey() + " and value is " + m.getValue());
        }

        //print all value using stream
        printHeader("Print all value using stream");
        names.entrySet()
                .stream()
                .forEach(m -> System.out.println("Index is " + m.getKey() + " and value is " + m.getValue()));

        //sort(ASC) index and then print all value using stream
        printHeader("sort(ASC) index and then print all value using stream");
        names.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(m -> System.out.println("Index is " + m.getKey() + " and value is " + m.getValue()));

        //sort(DESC) index and then print all value using stream
        printHeader("sort(DESC) index and then print all value using stream");
        names.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(m -> System.out.println("Index is " + m.getKey() + " and value is " + m.getValue()));


        //sort(ASC) VALUE and then print all value using stream
        printHeader("sort(ASC) VALUE and then print all value using stream");
        names.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(m -> System.out.println("Index is " + m.getKey() + " and value is " + m.getValue()));

        //sort(DESC) VALUE and then print all value using stream
        printHeader("sort(DESC) VALUE and then print all value using stream");
        names.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(m -> System.out.println("Index is " + m.getKey() + " and value is " + m.getValue()));

    }

    private static void printHeader(String title) {
        System.out.println("");
        System.out.println(title);
        System.out.println("======================");
    }
}