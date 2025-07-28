package codingbat.solutions.Array2;

public class countEvens{
    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens(new int[]{1, 3, 5}));
    }
    //Function Done by Mariya
    public static int countEvens(int[] nums) {
        int count = 0; // Initial
        // loop
        for (int num : nums) {
            // Check if even
            if (num % 2 == 0) {
                count++; //Increment if even
            }
        }
        return count; //Return
    }
}
