package codingbat.solutions.Array1;
public class makeMiddle {
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println(java.util.Arrays.toString(makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
        System.out.println(java.util.Arrays.toString(makeMiddle(new int[]{1, 2})));
    }
    // Function Done By Mariy
    public static int[] makeMiddle(int[] nums) {
        int midIndex = nums.length / 2;
        return new int[]{nums[midIndex - 1], nums[midIndex]};
    }
}
