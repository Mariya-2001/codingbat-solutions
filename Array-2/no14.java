package codingbat.solutions.Array2;
public class no14 {
    public static void main(String[] args) {
        System.out.println(no14(new int[]{1, 2, 3}));
        System.out.println(no14(new int[]{1, 2, 3, 4}));
        System.out.println(no14(new int[]{2, 3, 4}));
    }
    // Function Done by Mariya
    public static boolean no14(int[] nums) {
        boolean hasOne = false;
        boolean hasFour = false;
        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
            }
            if (num == 4) {
                hasFour = true;
            }
        }
        return !hasOne || !hasFour;
    }
}
