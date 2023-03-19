class Hello {
    public static void main(String[] a) {
        System.out.println("Hello World!");
        Calculator cal = new Calculator();

        cal.add(200, 100);
        cal.add(200, 100, 300);
        cal.add(200, 100, 300, 400);
    }

}

class Calculator {

    public void add(int a, int b) {
        int sum = a + b;
        showResult(sum);
    }

    public void add(int a, int b, int c) {
        int sum = a + b + c;
        showResult(sum);
    }

    public void add(int a, int b, int c, int d) {
        int sum = a + b + c + d;
        showResult(sum);
    }

    private void showResult(int sum) {
        System.out.println("Sum=" + sum);
    }
}