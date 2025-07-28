package codingbat.solutions.String2;

public class doubleChar {
    public static void main(String[] args) {
        // Example usage
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }
    //Function Done by Mariya
    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }
}
