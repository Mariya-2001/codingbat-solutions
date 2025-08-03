package codingbat.solutions.Functional1;
import java.util.ArrayList;
import java.util.List;
public class copies3 {
    public static void main(String[] args) {
        System.out.println(copies3(List.of("a", "bb", "ccc")));
        System.out.println(copies3(List.of("24", "a", "")));
        System.out.println(copies3(List.of("hello", "there")));
    }
    // Function Done by Mariya
    public static List<String> copies3(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add(str.repeat(3));
        }
        return result;
    }
}
