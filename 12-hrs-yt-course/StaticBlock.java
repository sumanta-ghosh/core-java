public class StaticBlock {
    public static void main(String arg[]) throws ClassNotFoundException {
        // Mobile m1 = new Mobile();
        // Mobile m2 = new Mobile();
        Class.forName("Mobile");

    }
}

class Mobile {
    static {
        System.out.println("I am from static block");
    }

    Mobile() {
        System.out.println("I am from Mobile constructor");
    }
}
