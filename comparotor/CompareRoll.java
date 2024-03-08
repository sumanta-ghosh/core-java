import java.util.Comparator;

public class CompareRoll implements Comparator<Student> {

  @Override
  public int compare(Student obj1, Student obj2) {
    return obj1.roll() - obj2.roll();
  }
}
