package main;

public class Main {

    public static void main(String[] args) {

        metodosStringBuilder();

    }

    public static void metodosStringBuilder() {

        StringBuilder objeto = new StringBuilder();

        // Agregar una cadena al objeto
        objeto.append("Hola amigo, buenos días.");
        objeto.append(" ¿Que tal?");
        System.out.println(objeto);

        // Insertar una cadena en la posicion especificada
        objeto.insert(4, " Josue,");
        System.out.println(objeto);

        // Eliminar caracteres
        objeto.delete(0, 3 + 1);
        System.out.println(objeto);

    }

}
