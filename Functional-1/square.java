package codingbat.solutions.Functional1;
import java.util.ArrayList;
import java.util.List;

public class square {
    public static void main(String[] args) {
        System.out.println(square(List.of(1, 2, 3)));
        System.out.println(square(List.of(6, 8, -6, -8, 1)));
        System.out.println(square(List.of()));
    }
    // Function Done By Mariya
    public static List<Integer> square(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            result.add(num * num);
        }
        return result;
    }
}
