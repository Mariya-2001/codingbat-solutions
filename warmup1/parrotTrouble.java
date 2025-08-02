package codingbat.solutions.warmup1;

public class parrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }

    // Function done by Mariya
    public static boolean parrotTrouble( boolean talking , int hour ) {
        return talking && ( hour < 7 || hour > 20 );
    }
}
