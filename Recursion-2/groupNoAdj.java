package codingbat.solutions.Recursion2;

public class groupNoAdj {
    public static void main(String[] args) {
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 12));
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 14));
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 7));
    }
    // Function done by Mariya
    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if (target == 0) {
            return true;
        }
        if (start >= nums.length) {
            return false;
        }
        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }
        return groupNoAdj(start + 1, nums, target);
    }
}
