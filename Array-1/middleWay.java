package codingbat.solutions.Array1;
public class middleWay {
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println(java.util.Arrays.toString(middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0})));
        System.out.println(java.util.Arrays.toString(middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5})));
    }
    // Function Done By Mariya
    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }
}