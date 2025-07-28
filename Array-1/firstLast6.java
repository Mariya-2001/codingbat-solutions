package codingbat.solutions.Array1;

public class firstLast6{
    public static void main(String[] args) {
        System.out.println(firstLast6(new int[]{1, 2, 6}));
        System.out.println(firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3}));
    }
    //Function Done by Mariya
    public static boolean firstLast6(int[] nums) {
        // Checking
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}