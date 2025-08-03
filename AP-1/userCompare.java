package codingbat.solutions.AP1;
public class userCompare{
    public static void main(String[] args) {
        System.out.println(userCompare("bb", 1, "zz", 2));
        System.out.println(userCompare("bb", 1, "aa", 2));
        System.out.println(userCompare("bb", 1, "bb", 1));
    }
    // Function done by Mariya
    public static int userCompare(String aName, int aId, String bName, int bId) {
        int nameComparison = aName.compareTo(bName);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(aId, bId);
    }
}
