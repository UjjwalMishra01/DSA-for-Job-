package src;

public class pangram_check {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";

        boolean found = checkIfPangram(str);
        if (found) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a pangram");
        }
    }

    public static boolean checkIfPangram(String sentence) {
        int count = 0;

        outerLoop:
        for (char i = 'a'; i <= 'z'; i++) {
            innerLoop:
            for (int j = 0; j < sentence.length(); j++) {
                char ch = sentence.charAt(j);
                if (ch == i) {
                    count++;
                    break innerLoop;
                }
            }
        }

        if (count == 26) {
            return true;
        }

        return false;
    }
}
