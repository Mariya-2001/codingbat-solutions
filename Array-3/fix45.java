package codingbat.solutions.Array3;
public class fix45{
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(fix45(new int[]{5, 4, 9, 4, 9, 5})));
        System.out.println(java.util.Arrays.toString(fix45(new int[]{1, 4, 1, 5})));
        System.out.println(java.util.Arrays.toString(fix45(new int[]{1, 4, 1, 5, 5, 4, 1})));
    }
    // Function done by Mariya
    public static int[] fix45(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        boolean[] used = new boolean[n];
        int index = 0;
        for (int num : nums) {
            if (num != 4 && num != 5) {
                result[index++] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 4) {
                result[index++] = 4;
                for (int j = 0; j < n; j++) {
                    if (nums[j] == 5 && !used[j]) {
                        result[index++] = 5;
                        used[j] = true;
                        break;
                    }
                }
            }
        }

        return result;
    }
}
