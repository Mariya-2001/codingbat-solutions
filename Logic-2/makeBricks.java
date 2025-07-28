package codingbat.solutions.Logic2;

public class makeBricks{
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
    }
    //Function Done By Mariya
    public static boolean makeBricks(int small, int big, int goal) {
        int maxBigBricks = Math.min(big, goal / 5);
        int remainingLength = goal - (maxBigBricks * 5);
        return remainingLength <= small;
    }
}
