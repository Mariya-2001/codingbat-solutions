package codingbat.solutions.AP1;
import java.util.ArrayList;
import java.util.List;
public class wordsWithoutList {
    public static void main(String[] args) {
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3));
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4));
    }
    // Function done by Mariya
    public static List<String> wordsWithoutList(String[] words, int len) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) {
                result.add(word);
            }}
        return result;
    }
}
