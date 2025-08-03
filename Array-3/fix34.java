package codingbat.solutions.Array3;
public class fix34 {
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(fix34(new int[]{1, 3, 1, 4})));
        System.out.println(java.util.Arrays.toString(fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));
        System.out.println(java.util.Arrays.toString(fix34(new int[]{3, 2, 2, 4})));
    }
    // Function done by Mariya
    public static int[] fix34(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;
        for (int num : nums) {
            if (num != 3 && num != 4) {
                result[index++] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 3) {
                result[index++] = 3;
                result[index++] = 4;
            }
        }
        return result;
    }
}
