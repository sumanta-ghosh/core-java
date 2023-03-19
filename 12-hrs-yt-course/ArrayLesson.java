public class ArrayLesson {
    public static void main(String args[]) {
        int nums[] = new int[6];
        nums[0] = 10;
        nums[1] = 100;
        nums[2] = 1000;
        nums[3] = 10000;
        nums[4] = 100000;
        nums[5] = 1000000;

        for (int i : nums) {
            System.out.println(i);
        }
    }
}
