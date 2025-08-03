package codingbat.solutions.Functional1;
import java.util.ArrayList;
import java.util.List;

public class noX {
    public static void main(String[] args) {
        System.out.println(noX(List.of("ax", "bb", "cx")));
        System.out.println(noX(List.of("xxax", "xbxbx", "xxcx")));
        System.out.println(noX(List.of("x")));
    }
    // Function Done By Mariya
    public static List<String> noX(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            result.add(str.replace("x", ""));
        } return result;
    }
}
