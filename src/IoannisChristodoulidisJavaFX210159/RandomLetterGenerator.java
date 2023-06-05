/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IoannisChristodoulidisJavaFX210159;
import java.util.Random;
/**
 *
 * @author johnn
 */
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
