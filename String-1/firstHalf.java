package codingbat.solutions.String1;

public class firstHalf {
    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }
    //Function done my Mariya
    public static String firstHalf(String str) {
        int halfLength = str.length() / 2; //midpoint calculation
        return str.substring(0, halfLength);
    }
}
