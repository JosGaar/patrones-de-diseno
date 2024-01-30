package dependency_inversion;

/**
 *
 * @author Josue
 */
public class Principal {

    public static void main(String[] args) {

        Teclado teclado = new Teclado();
        Mouse mouse = new Mouse();

        Computadora computadora = new Computadora(teclado, mouse);
        computadora.encender();
    }

}
