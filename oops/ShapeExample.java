// Interface Shape
interface Shape {
  double calculateArea();
}

// Subclass Circle
class Circle implements Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

// Subclass Rectangle
class Rectangle implements Shape {

  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }
}

// Subclass Triangle
class Triangle implements Shape {

  private double base;
  private double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return 0.5 * base * height;
  }
}

public class ShapeExample {

  public static void main(String[] args) {
    // Using dynamic method dispatch with interface
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);
    Shape triangle = new Triangle(3, 4);

    // Calls overridden calculateArea() method of respective objects
    System.out.println("Area of Circle: " + circle.calculateArea());
    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    System.out.println("Area of Triangle: " + triangle.calculateArea());
  }
}
