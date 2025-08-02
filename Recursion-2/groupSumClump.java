package codingbat.solutions.Recursion2;

public class groupSumClump{
    public static void main(String[] args) {
        System.out.println(groupSumClump(0, new int[]{2, 4, 8}, 10));
        System.out.println(groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14));
        System.out.println(groupSumClump(0, new int[]{2, 4, 4, 8}, 14));
    }
    // Function done by Mariya
    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        int currentValue = nums[start];
        int count = 0;
        while (start + count < nums.length && nums[start + count] == currentValue) {
            count++;
        }
        if (groupSumClump(start + count, nums, target - currentValue * count)) {
            return true;
        }
        return groupSumClump(start + count, nums, target);
    }
}
