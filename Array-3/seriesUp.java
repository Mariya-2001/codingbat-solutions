package codingbat.solutions.Array3;
public class seriesUp{
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(seriesUp(3)));
        System.out.println(java.util.Arrays.toString(seriesUp(4)));
        System.out.println(java.util.Arrays.toString(seriesUp(2)));
    }
    // Function done by Mariya
    public static int[] seriesUp(int n) {
        int length = n * (n + 1) / 2;
        int[] result = new int[length];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }}
        return result;
    }
}
