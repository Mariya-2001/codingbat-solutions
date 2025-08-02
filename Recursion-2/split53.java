package codingbat.solutions.Recursion2;

public class split53 {
    public static void main(String[] args) {
        System.out.println(split53(new int[]{1, 1}));
        System.out.println(split53(new int[]{1, 1, 1}));
        System.out.println(split53(new int[]{2, 4, 2}));
    }
    // Function done by Mariya
    public static boolean split53(int[] nums) {
        return split53Helper(nums, 0, 0, 0);
    }

    private static boolean split53Helper(int[] nums, int index, int sum3, int sum5) {
        if (index == nums.length) {
            return sum3 == sum5;
        }
        int current = nums[index];

        if (current % 5 == 0) {
            return split53Helper(nums, index + 1, sum3, sum5 + current);
        }
        else if (current % 3 == 0) {
            return split53Helper(nums, index + 1, sum3 + current, sum5);
        }
        return split53Helper(nums, index + 1, sum3 + current, sum5) ||
                split53Helper(nums, index + 1, sum3, sum5 + current);
    }
}
