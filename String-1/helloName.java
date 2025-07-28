package codingbat.solutions.String1;

public class helloName {
    public static void main(String[] args) {

        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
    }
    // Function Done by Mariya
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
}
