package generic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Sumanta....");
        Speakar<String> sp = new Speakar<>();
        System.out.println(sp.getVal("Sumanta"));

        Speakar<Integer> sp2 = new Speakar<>();
        System.out.println(sp2.getVal(1250));
    }
}
