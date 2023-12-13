package FunctionalInterface;

import java.util.function.Function;

public class Practice01 {
    public static void main(String[] args) {
        System.out.println("Hello SKG!!!");

        Function<String, Integer> count = str -> str.length();
        Function<Integer, String> countX2 = cnt -> "Count: " + cnt + ", Double: " + cnt * 2;

        Function<String, String> finalFT = count.andThen(countX2);

        System.out.println(finalFT.apply("Sumanta..."));

    }
}
