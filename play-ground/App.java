import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

  public static void main(String[] arg) {
    System.out.println("Person record class");
    PersonRecord person1 = new PersonRecord("Sumanta", "Deshra", 35);
    PersonRecord person2 = new PersonRecord("Saheb", "Kotulpur", 36);
    PersonRecord person3 = new PersonRecord("Sumanta", "Deshra", 35);

    System.out.println("Person1");
    System.out.println("Name: " + person1.name());
    System.out.println("Name: " + person1.address());
    System.out.println("Name: " + person1.age());
    System.out.println(person1.hashCode() == person3.hashCode());
    System.out.println(person1.equals(person3));
    System.out.println(person2.toString());

    List<PersonRecord> recordList = new ArrayList<>();
    recordList.add(person1);
    recordList.add(person2);
    recordList.add(person3);

    label("Print recordList");
    recordList.stream().forEach(System.out::println);

    label("Print filtered person whose age >= 35");
    recordList.stream().filter(p -> p.age() >= 35).forEach(System.out::println);

    List<PersonRecord> filteredList = recordList
      .stream()
      .filter(per -> per.age() > 35)
      .map(p -> p)
      .collect(Collectors.toList());

    label("Print filtered list");
    streamOf(filteredList).forEach(System.out::println);

    //Stream of String

    label("Stream of String using builder");
    Stream<String> stringBuilder = Stream
      .<String>builder()
      .add("a")
      .add("b")
      .add("c")
      .build();
    stringBuilder.forEach(System.out::println);

    label("Stream of Integer using builder");
    Stream<Integer> intStream = Stream
      .<Integer>builder()
      .add(100)
      .add(200)
      .add(300)
      .build();

    intStream.forEach(System.out::println);

    label("Stream using generate");
    Stream<String> seqString = Stream.generate(() -> "Person ").limit(5);
    seqString.forEach(System.out::println);

    label("Stream using iterate");
    Stream<Integer> stOfiIerate = Stream.iterate(1, n -> n + 1).limit(5);
    stOfiIerate.map(i -> "Person " + i).forEach(System.out::println);

    label("Reduce");

    int totalAge = recordList
      .stream()
      .mapToInt(PersonRecord::age)
      .reduce(0, Integer::sum);
    System.out.println("Total age: " + totalAge);

    label("Sum of all age using collect");
    int totalAge2 = recordList
      .stream()
      .collect(Collectors.summingInt(PersonRecord::age));
    System.out.println("Total age: " + totalAge2);

    label("Avg of all age using collect");
    Double avgAge = recordList
      .stream()
      .collect(Collectors.averagingInt(PersonRecord::age));
    System.out.println("Total age: " + avgAge);

    label("Print all names only");

    String allNames = recordList
      .stream()
      .map(PersonRecord::name)
      .collect(Collectors.joining(", ", "[", "]"));
    System.out.println("Names : " + allNames);

    label("Age statistics");
    IntSummaryStatistics statistics = recordList
      .stream()
      .collect(Collectors.summarizingInt(PersonRecord::age));
    System.out.println(statistics);

    label("groupingBy");
    Map<Integer, List<PersonRecord>> collectorMapOfLists = recordList
      .stream()
      .collect(Collectors.groupingBy(PersonRecord::age));
    System.out.println(collectorMapOfLists);
  }

  public static void label(String label) {
    System.out.println("");
    System.out.println("");
    System.out.println("\u001B[1;32m\u00BB " + label + "\u001B[0m");
    String seperator = "-".repeat(label.length() + 4);
    System.out.println("\u001B[1;33m" + seperator + "\u001B[0m");
  }

  public static Stream<List<PersonRecord>> streamOf(
    List<PersonRecord> recordList
  ) {
    return Stream.of(recordList);
  }
}
