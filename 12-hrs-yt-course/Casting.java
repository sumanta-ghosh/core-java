
public class Casting {
    public static void main(String a[]) {
        A obj = new B();
        obj.show();
        B obj2 = (B) obj;
        obj2.echo();
    }
}

class A {
    public void show() {
        System.out.println("This is show method from A class");
    }
}

class B extends A {
    public void show() {
        System.out.println("This is show method from B class");
    }

    public void echo() {
        System.out.println("This is echo method from B class");
    }
}
