package codingbat.solutions.warmup2;

public class frontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
    }

    // Function done by Mariya
    public static String frontTimes( String str , int n ) {
        String front = str.length() < 3 ? str : str.substring( 0 , 3 );
        StringBuilder result = new StringBuilder();

        for ( int i = 0 ; i < n ; i++ ) {
            result.append(front);
        }
        return result.toString();
    }
}
