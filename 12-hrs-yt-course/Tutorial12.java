
public class Tutorial12 {
    public static void main(String a[]) {

        for (Laptop l : Laptop.values()) {
            System.out.println(l + " --> " + l.getPrice());
        }

    }
}

enum Laptop {

    Macbook(2200), DelXPS(2500), LenovoYoga(1200), Acer;

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop() {
        this.price = 500;
        System.out.println("Default constructor");
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("Param constructor");
    }
}