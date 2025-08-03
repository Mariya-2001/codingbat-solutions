package codingbat.solutions.Recursion1;

public class array11{
    public static void main(String[] args) {
        System.out.println(array11(new int[]{1, 2, 11}, 0));
        System.out.println(array11(new int[]{11, 11}, 0));
        System.out.println(array11(new int[]{1, 2, 3, 4}, 0));
    }
    // Function done by Mariya
    public static int array11(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        int count = (nums[index] == 11) ? 1 : 0;
        return count + array11(nums, index + 1);
    }
}
