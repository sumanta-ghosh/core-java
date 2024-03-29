package collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String[] args) {
        //Data set
        List<String> names = new ArrayList<>(Arrays.asList("Sumanta", "Sumanta", "Ram", "Ram", "Shyam"));
        System.out.println(names);

        //1st way
        Set<String> unique = new HashSet<>();
        List<String> duplicateNames1 = names.stream().filter(name -> !unique.add(name)).collect(Collectors.toList());
        System.out.println(duplicateNames1);

        //2nd way
        Map<String, Long> nameWithCount = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> duplicateNames2 = nameWithCount.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toList());
        System.out.println(nameWithCount);
        System.out.println(duplicateNames2);

        //3rd way
        Set<String> duplicateNames3 = names.stream().filter(entry -> Collections.frequency(names, entry) > 1).collect(Collectors.toSet());
        System.out.println(duplicateNames3);
    }
}
