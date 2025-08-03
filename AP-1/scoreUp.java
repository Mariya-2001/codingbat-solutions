package codingbat.solutions.AP1;
public class scoreUp {
    public static void main(String[] args) {
        System.out.println(scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "c"}));
        System.out.println(scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"}));
        System.out.println(scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "b"}));
    }
    // Function done by Mariya
    public static int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals("?")) {
                continue;
            }
            if (answers[i].equals(key[i])) {
                score += 4;
            } else {
                score -= 1;
            }
        }
        return score;
    }
}
