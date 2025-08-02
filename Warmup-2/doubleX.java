package codingbat.solutions.warmup2;

public class doubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }

    // Function done by Mariya
    public static boolean doubleX(String str) {
        int index = str.indexOf('x');
        return index != -1 && index + 1 < str.length() && str.charAt(index + 1) == 'x';
    }
}
