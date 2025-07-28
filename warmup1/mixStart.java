package codingbat.solutions.warmup1;
public class mixStart{
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }
    //Function Done By ML
    public static boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals( "ix" );
    }
}