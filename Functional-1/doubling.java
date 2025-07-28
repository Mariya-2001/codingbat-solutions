package codingbat.solutions.Functional1;

import java.util.ArrayList;
import java.util.List;

public class doubling{
    public static void main(String[] args) {
        System.out.println(doubling(List.of(1, 2, 3)));
        System.out.println(doubling(List.of(6, 8, 6, 8, -1)));
        System.out.println(doubling(List.of()));
    }
    //Function Done by Mariya Allamki
    public static List<Integer> doubling(List<Integer> nums) {
        List<Integer> res = new ArrayList<>();
        for (Integer num : nums) {
            res.add(num * 2);
        }
        return res;
    }
}
