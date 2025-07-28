package codingbat.solutions.Functional2;
import java.util.ArrayList;
import java.util.List;

public class noNeg{
    public static void main(String[] args) {
        System.out.println(noNeg(List.of(1, -2)));
        System.out.println(noNeg(List.of(-3, -3, 3, 3)));
        System.out.println(noNeg(List.of(-1, -1, -1)));
    }
    //Function Done by Mariya Allamki
    public static List<Integer> noNeg(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num >= 0) {
                result.add(num);
            }
        }
        return result;
    }
}
