package codingbat.solutions.Array2;
public class matchUp {
    public static void main(String[] args) {
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }
    // Function Done by Mariya
    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]) {
                count++;
            }}
        return count;
    }
}
