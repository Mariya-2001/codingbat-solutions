package codingbat.solutions.Array3;
public class maxMirror {
    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        System.out.println(maxMirror(new int[]{1, 2, 1, 4}));
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }
    // Function done by Mariya
    public static int maxMirror(int[] nums) {
        int maxLength = 0;
        int n = nums.length;
        for (int start = 0; start < n; start++) {
            for (int end = n - 1; end >= 0; end--) {
                int length = 0;
                int i = start;
                int j = end;
                while (i < n && j >= 0 && nums[i] == nums[j]) {
                    length++;
                    i++;
                    j--;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
