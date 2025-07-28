package codingbat.solutions.warmup1;
public class close10{
    public static void main(String[] args) {
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
    }
    //Function to choose which number is closer to 10 .. Mariya Allamki
    public static int close10(int a, int b) {
        int distanceA = Math.abs(a - 10);
        int distanceB = Math.abs(b - 10);

        if (distanceA < distanceB) {
            return a;
        } else if (distanceB < distanceA) {
            return b;
        } else {
            return 0;
        }
    }
}
