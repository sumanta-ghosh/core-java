package Optional;

import java.util.Optional;

public class App {

  public static void main(String[] args) {
    String skg = "Sumanta";
    Optional<String> name = Optional.ofNullable(skg);
    name.ifPresent(System.out::println);
    //System.out.println(name.get());

    String nullName = null;
    String name2 = Optional.ofNullable(nullName).orElse("john");
    System.out.println(name2);
    String name3 = Optional
      .ofNullable(skg)
      .orElseGet(() -> {
        return "John Doe";
      });
    System.out.println(name3);
  }
}
