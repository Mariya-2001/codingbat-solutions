package codingbat.solutions.Array2;
public class modThree {
    public static void main(String[] args) {
        System.out.println(modThree(new int[]{2, 1, 3, 5}));
        System.out.println(modThree(new int[]{2, 1, 2, 5}));
        System.out.println(modThree(new int[]{2, 4, 2, 5}));
    }
    // Function Done by Mariya
    public static boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == nums[i + 1] % 2) && (nums[i] % 2 == nums[i + 2] % 2)) {
                return true;
            }}
        return false;
    }
}
