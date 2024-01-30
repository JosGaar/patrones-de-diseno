package ejercicios;

/**
 *
 * @author Josue
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        String numStr = String.valueOf(x);
        boolean sonIguales = true;
        
        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i)) sonIguales = false;
        }

        return sonIguales;
    }

}
