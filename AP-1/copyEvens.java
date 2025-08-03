package codingbat.solutions.AP1;
public class copyEvens{
    public static void main(String[] args) {
        int[] result1 = copyEvens(new int[]{3, 2, 4, 5, 8}, 2);
        int[] result2 = copyEvens(new int[]{3, 2, 4, 5, 8}, 3);
        int[] result3 = copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 3);
        // result
        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
        System.out.println(java.util.Arrays.toString(result3));
    }
    // Function done by Mariya
    public static int[] copyEvens(int[] nums, int count) {
        int[] evens = new int[count];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evens[index] = num;
                index++;
                if (index == count) {
                    break;
                }
            }
        }
        return evens;
    }
}
