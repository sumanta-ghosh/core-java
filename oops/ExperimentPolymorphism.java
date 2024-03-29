//Superclass
class Animal {

  public void sound() {
    System.out.println("Animal makes a sound..");
  }
}

//Subclass Dog
class Dog extends Animal {

  @Override
  public void sound() {
    System.out.println("Dog barks...");
    this.test();
  }

  public void test() {
    System.out.println("This is test method in dog...");
  }
}

//Subclass Cat
class Cat extends Animal {

  @Override
  public void sound() {
    System.out.println("Cat meows");
  }
}

//Main class

public class ExperimentPolymorphism {

  public static void main(String[] args) {
    //Runtime polymorphism (method overriding)

    Animal dog = new Dog();
    Animal cat = new Cat();

    dog.sound();
    cat.sound();
  }
}
