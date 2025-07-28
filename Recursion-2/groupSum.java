package codingbat.solutions.Recursion2;

public class groupSum{
    public static void main(String[] args) {
        System.out.println(groupSum(0, new int[]{2, 4, 8}, 10));
        System.out.println(groupSum(0, new int[]{2, 4, 8}, 14));
        System.out.println(groupSum(0, new int[]{2, 4, 8}, 9));
    }
    //Function Done by Mariya
    public static boolean groupSum(int start, int[] nums, int target) {
        if (target == 0) {
            return true;
        }
        if (start >= nums.length) {
            return false;
        }
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }
        return groupSum(start + 1, nums, target);
    }
}
