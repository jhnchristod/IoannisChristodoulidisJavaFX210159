package IoannisChristodoulidisJavaFX210159;
import java.util.Random;

public class RandomLetterGenerator {
     private static final String ALPHABET = "αβγδεζηθικλμνξοπρστυφχψω";

    public static String generateRandomLetters(int n) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(ALPHABET.charAt(rand.nextInt(ALPHABET.length())));
        }
        return sb.toString();
    }
}
