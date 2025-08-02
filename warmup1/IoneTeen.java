package codingbat.solutions.warmup1;

public class IoneTeen {
    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
    }

    // Function done by Mariya
    public static boolean loneTeen(int a, int b) {
        boolean isATeen = (a >= 13 && a <= 19);
        boolean isBTeen = (b >= 13 && b <= 19);
        return (isATeen || isBTeen) && !(isATeen && isBTeen);
    }
}
