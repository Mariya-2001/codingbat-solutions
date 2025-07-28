package codingbat.solutions.String1;

public class makeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }
    //Function Done by Mariya
    public static String makeOutWord(String out, String word) {

        String front = out.substring(0, 2);
        String back = out.substring(2);
        return front + word + back;
    }
}
