package codingbat.solutions.AP1;

public class scoresIncreasing{
    public static void main(String[] args) {
        System.out.println(scoresIncreasing(new int[]{1, 3, 4}));
        System.out.println(scoresIncreasing(new int[]{1, 3, 2}));
        System.out.println(scoresIncreasing(new int[]{1, 1, 4}));
    }
    //Function Done by Mariya
    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
