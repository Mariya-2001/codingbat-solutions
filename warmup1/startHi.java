package codingbat.solutions.warmup1;
public class startHi{
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }
    //Function Done by ML
    public static boolean startHi(String str) {
        return str.length() >= 2 && str.startsWith("hi");
    }
}
