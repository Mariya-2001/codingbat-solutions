package codingbat.solutions.Array3;

public class squareUp {
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(squareUp(3)));
        System.out.println(java.util.Arrays.toString(squareUp(2)));
        System.out.println(java.util.Arrays.toString(squareUp(4)));
    }
    // Function done by Mariya
    public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int index = i * n + j;
                if (j >= n - i - 1) {
                    result[index] = j - (n - i - 1);
                } else {
                    result[index] = 0;
                }
            }
        }
        return result;
    }
}
