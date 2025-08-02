package codingbat.solutions.Recursion2;

public class groupSum6{
    public static void main(String[] args) {
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 8));
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 9));
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 7));
    }
    // Function done by Mariya
    public static boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - 6);
        } else {
            return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
        }
    }
}
