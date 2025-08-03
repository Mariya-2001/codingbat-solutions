package codingbat.solutions.Array1;
public class fix23 {
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(fix23(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(fix23(new int[]{2, 3, 5})));
        System.out.println(java.util.Arrays.toString(fix23(new int[]{1, 2, 1})));
    }
    // Function Done by Mariya
    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }
}
