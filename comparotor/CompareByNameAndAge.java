import java.util.Comparator;

public class CompareByNameAndAge implements Comparator<Student> {

  @Override
  public int compare(Student obj1, Student obj2) {
    int nameCompare = obj1.getName().compareTo(obj2.getName());
    int ageCompare = obj1.getAge() - obj2.getAge();

    return nameCompare == 0 ? ageCompare : nameCompare;
  }
}
