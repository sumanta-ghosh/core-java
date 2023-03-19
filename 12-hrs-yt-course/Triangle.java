public class Triangle {
    public static void main(String arg[]) {
        int height = 15;
        for (int l = 0; l < height; l++) {
            for (int space = height; space >= l; space--) {
                System.out.print(" ");
            }
            for (int star = (l * 2 + 1); star > 0; star--) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}