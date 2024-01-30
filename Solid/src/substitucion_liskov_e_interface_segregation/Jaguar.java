package substitucion_liskov_e_interface_segregation;

/**
 *
 * @author Josue
 */
public class Jaguar extends Animal implements FelinoSalvaje {
    
    private int edad;
    private float peso;
    
    public Jaguar() {
        this.edad = 0;
        this.peso = 0;
    }

    public Jaguar(int edad, float peso) {
        this.edad = edad;
        this.peso = peso;
    }

    public Jaguar(int edad) {
        this.edad = edad;
        this.peso = 0;
    }

    public Jaguar(float peso) {
        this.edad = 0;
        this.peso = peso;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Mi edad es" + this.getEdad() + " Mi peso es" + this.getPeso();
    }
    
    public void dormir() {
        System.out.println("El jaguar duerme");
    }
    
    public void comer() {
        System.out.println("El jaguar come");
    }
    
    @Override
    public void rugir() {
        System.out.println("El jaguar ruge");
    }
    
    @Override
    public void cazar() {
        System.out.println("El jaguar caza");
    }
    
}

