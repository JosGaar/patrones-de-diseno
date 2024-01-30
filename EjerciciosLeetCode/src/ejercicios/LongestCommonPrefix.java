package ejercicios;

/**
 *
 * @author Josue
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"dog","dog","dogx"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefijo = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            // iterar siempre y cuando los elementos x no empiecen con el prefijo
            while (!strs[i].startsWith(prefijo)) {
                // de tal forma que vamos quitando caracteres y volvemos a verificar el while
                prefijo = prefijo.substring(0, prefijo.length() - 1);
            }
        }
  
        return prefijo;

    }
}
