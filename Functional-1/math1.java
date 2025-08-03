package codingbat.solutions.Functional1;
import java.util.ArrayList;
import java.util.List;

public class math1 {
    public static void main(String[] args) {
        System.out.println(math1(List.of(1, 2, 3)));
        System.out.println(math1(List.of(6, 8, 6, 8, 1)));
        System.out.println(math1(List.of(10)));
    }
    // Function Done By Mariya
    public static List<Integer> math1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            result.add((num + 1) * 10);
        }
        return result;
    }
}
