package codingbat.solutions.String3;

public class countYZ{
    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));
    }
    //Function Done By Mariya
    public static int countYZ(String str) {
        String[] words = str.split("\\s+");
        int count = 0;
        for (String word : words) {
            char lastChar = word.toLowerCase().charAt(word.length() - 1);
            if (lastChar == 'y' || lastChar == 'z') {
                if (word.length() == 1 || !Character.isLetter(word.charAt(word.length() - 2))) {
                    count++;
                }
            }
        }
        return count;
    }
}
