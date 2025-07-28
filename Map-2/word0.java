package codingbat.solutions.Map2;
import java.util.HashMap;
import java.util.Map;

public class word0{
    public static void main(String[] args) {

        System.out.println(word0(new String[]{"a", "b", "a", "b"}));
        System.out.println(word0(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(word0(new String[]{"c", "b", "a"}));
    }
    //Function By Mariya Allamki
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, 0);
        }
        return map;
    }
}