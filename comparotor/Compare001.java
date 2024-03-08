import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare001 {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    students.add(new Student("Sumanta", 35, 5));
    students.add(new Student("Robin", 39, 8));
    students.add(new Student("Sudip", 36, 1));
    students.add(new Student("Amit", 34, 3));
    students.add(new Student("Abhijan", 35, 4));
    students.add(new Student("Kripa", 35, 6));
    students.add(new Student("Lambu", 35, 7));
    students.add(new Student("Bijoy", 35, 2));
    Collections.sort(students, new CompareRoll());
    for (Student std : students) {
      System.out.println(std);
    }
  }
}
