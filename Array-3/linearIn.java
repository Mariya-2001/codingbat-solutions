package codingbat.solutions.Array3;
public class linearIn {
    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }
    // Function done by Mariya
    public static boolean linearIn(int[] outer, int[] inner) {
        int outerIndex = 0;
        int innerIndex = 0;
        while (outerIndex < outer.length && innerIndex < inner.length) {
            if (outer[outerIndex] == inner[innerIndex]) {
                innerIndex++;
            }
            outerIndex++;
        }
        return innerIndex == inner.length;
    }
}
