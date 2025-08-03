package codingbat.solutions.Functional1;
import java.util.ArrayList;
import java.util.List;

public class rightDigit {
    public static void main(String[] args) {
        System.out.println(rightDigit(List.of(1, 22, 93)));
        System.out.println(rightDigit(List.of(16, 8, 886, 8, 1)));
        System.out.println(rightDigit(List.of(10, 0)));
    }
    // Function Done By Mariya
    public static List<Integer> rightDigit(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            result.add(num % 10);
        }
        return result;
    }
}
