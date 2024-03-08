import java.util.Comparator;

public class CompareByAge implements Comparator<Student> {

  @Override
  public int compare(Student obj1, Student obj2) {
    return obj1.getAge() - obj2.getAge();
  }
}
