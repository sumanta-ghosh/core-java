public class AbstractClass {
    public static void main(String a[]) {
        Car wagonr = new WagonR();
        wagonr.drive();
    }
}

abstract class Car {
    abstract void drive();

    public final void playMusic() {
        System.out.println("Music is playing...");
    }

}

class WagonR extends Car {
    public void drive() {
        System.out.println("Driving WagonR Car");
    }
}
