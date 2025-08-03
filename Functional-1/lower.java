package codingbat.solutions.Functional1;
import java.util.ArrayList;
import java.util.List;
public class lower {
    public static void main(String[] args) {
        System.out.println(lower(List.of("Hello", "Hi")));
        System.out.println(lower(List.of("AAA", "BBB", "ccc")));
        System.out.println(lower(List.of("KitteN", "ChocolaTE")));
    }
    // Function Done By Mariya
    public static List<String> lower(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add(str.toLowerCase());
        }
        return result;
    }
}
