package codingbat.solutions.Functional1;
import java.util.ArrayList;
import java.util.List;

public class addStar {
    public static void main(String[] args) {
        System.out.println(addStar(List.of("a", "bb", "ccc")));
        System.out.println(addStar(List.of("hello", "there")));
        System.out.println(addStar(List.of("*")));
    }
    // Function Done By Mariya
    public static List<String> addStar(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add(str + "*");
        }
        return result;
    }
}
