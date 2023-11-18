package play.ground;

public class OuterClass {
    private String name = "Sumanta";

    private void outerPrint(){
        System.out.println("Call outer private method");
        System.out.println(name);
    }

    class InnerClass {
        public void print() {
            System.out.println("Call inner class print method");
            outerPrint();
            System.out.println(name);
        }
    }

}