package codingbat.solutions.Map1;
import java.util.HashMap;
import java.util.Map;

public class mapBully{
    public static void main(String[] args) {
        System.out.println(mapBully(createMap("candy", "dirt")));
        System.out.println(mapBully(createMap("candy")));
        System.out.println(mapBully(createMap("candy", "carrot", "meh")));
    }
    //Function Done by Mariya
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey( "a" ) && !map.get( "a" ).isEmpty()) {
            map.put("b" , map.get( "a" ));
            map.put( "a" , "" );
        }
        return map;
    }

    // Map for test
    private static Map<String, String> createMap(String... values) {
        Map<String, String> map = new HashMap<>();
        for ( int i = 0; i < values.length; i++ ) {
            if (i == 0) {
                map.put( "a" , values[i]);
            } else if (i == 1) {
                map.put( "b" , values[i]);
            } else {
                map.put( "c" , values[i]);
            }
        }
        return map;
    }
}
