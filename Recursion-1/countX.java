package codingbat.solutions.Recursion1;
public class countX{
    public static void main(String[] args) {
        System.out.println(countX( "xxhixx" ));
        System.out.println(countX( "xhixhix" ));
        System.out.println(countX( "hi" ));
    }
    // Function done by Mariya
    public static int countX(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int count = (str.charAt(0) == 'x') ? 1 : 0;
        return count + countX(str.substring(1));
    }
}
