public class Tutorial10 {
    public static void main(String a[]) {
        A obj = new A() {
            public void showNum() {
                System.out.println("Num=" + num * 2);
            }
        };
        obj.show();
        obj.showNum();
    }
}

class A {
    int num = 10;

    public void show() {
        System.out.println("I am show from A class");
    }

    public void showNum() {
        System.out.println("Num=" + num);
    }

}
