package clases;

/**
 *
 * @author Josue
 */

// La pizzeria se debe de encargar todo el trabajo necesario para generar una pizza. Esta es la Simple Factory.
// El cliente desconoce el cómo.
public class Pizzeria {

    public Pizza crearPizzaChica() {
        return new Pizza(6);
    }

    public Pizza crearPizzaMediana() {
        return new Pizza(8);
    }

    public Pizza crearPizzaGrande() {
        return new Pizza(12);
    }

}
