package codingbat.solutions.Recursion2;

public class splitOdd10{
    public static void main(String[] args) {
        System.out.println(splitOdd10(new int[]{5, 5, 5}));
        System.out.println(splitOdd10(new int[]{5, 5, 6}));
        System.out.println(splitOdd10(new int[]{5, 5, 6, 1}));
    }
    // Function done by Mariya
    public static boolean splitOdd10(int[] nums) {
        return splitOdd10Helper(nums, 0, 0, 0);
    }

    private static boolean splitOdd10Helper(int[] nums, int index, int sum10, int sumOdd) {
        if (index == nums.length) {
            return sum10 % 10 == 0 && sumOdd % 2 == 1;
        }
        if (splitOdd10Helper(nums, index + 1, sum10 + nums[index], sumOdd)) {
            return true;
        }
        return splitOdd10Helper(nums, index + 1, sum10, sumOdd + nums[index]);
    }
}
