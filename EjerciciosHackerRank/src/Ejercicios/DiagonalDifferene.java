package Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifferene {

    public static void main(String[] args) {

        ArrayList<List<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> fila1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> fila2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> fila3 = new ArrayList<>(Arrays.asList(9, 8, 9));
        arr.add(fila1);
        arr.add(fila2);
        arr.add(fila3);

        System.out.println("Valor: " + diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int valorUno = 0;
        int valorDos = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {

                if (i == j) {
                    valorUno += arr.get(i).get(j);
                }

            }
        }

        int contador = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            valorDos += arr.get(i).get(contador);
            contador++;
        }

        return Math.abs(valorUno - valorDos);
    }

}
