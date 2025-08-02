package codingbat.solutions.Recursion2;

public class splitArray{
    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{2, 2}));
        System.out.println(splitArray(new int[]{2, 3}));
        System.out.println(splitArray(new int[]{5, 2, 3}));
    }
    // Function done by Mariya
    public static boolean splitArray(int[] nums) {
        return splitArrayHelper(nums, 0, 0, 0);
    }
    private static boolean splitArrayHelper(int[] nums, int index, int sum1, int sum2) {
        if (index == nums.length) {
            return sum1 == sum2;
        }
        if (splitArrayHelper(nums, index + 1, sum1 + nums[index], sum2)) {
            return true;
        }
        return splitArrayHelper(nums, index + 1, sum1, sum2 + nums[index]);
    }
}