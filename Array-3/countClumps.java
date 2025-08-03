package codingbat.solutions.Array3;

public class countClumps {
    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1}));
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));
    }
    // Function done by Mariya
    public static int countClumps(int[] nums) {
        int clumpCount = 0;
        boolean inClump = false;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                if (!inClump) {
                    clumpCount++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }
        return clumpCount;
    }
}
