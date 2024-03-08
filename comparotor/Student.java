public class Student {

  private String name;
  private int age;
  private int roll;

  public Student(String name, int age, int roll) {
    this.name = name;
    this.age = age;
    this.roll = roll;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public int roll() {
    return this.roll;
  }

  public String toString() {
    return "Name:" + this.name + ", Age:" + this.age + ", Roll:" + this.roll;
  }
}
