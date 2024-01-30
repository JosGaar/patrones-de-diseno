package ejercicios;

/**
 *
 * @author Josue
 */
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {

        int sumar = 0;
        String[] combinacionesRomanos = {"IV", "IX", "XL", "XC", "CD", "CM"};

        for (String combinaciones : combinacionesRomanos) {
            while (s.contains(combinaciones)) {
                sumar += getValorRomano(combinaciones);
                s = s.replace(combinaciones, "");
            }
        }

        for (int i = 0; i < s.length(); i++) {
            sumar += getValorRomano(String.valueOf(s.charAt(i)));
        }

        return sumar;
    }

    public static int getValorRomano(String simbolo) {
        switch (simbolo) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
            default:
                throw new IllegalArgumentException();
        }
    }
}
