package codingbat.solutions.Functional1;
import java.util.ArrayList;
import java.util.List;
public class moreY {
    public static void main(String[] args) {
        System.out.println(moreY(List.of("a", "b", "c")));
        System.out.println(moreY(List.of("hello", "there")));
        System.out.println(moreY(List.of("yay")));
    }
    // Function Done By Mariya
    public static List<String> moreY(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add("y" + str + "y");
        } return result;
    }
}
