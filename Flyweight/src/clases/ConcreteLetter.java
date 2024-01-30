package clases;

/**
 *
 * @author Josue
 */

// ConcreteFlyweight
public class ConcreteLetter implements ILetter {

    private char character;

    public ConcreteLetter(char character) {
        this.character = character;
    }

    @Override
    public void print(String font) {
        System.out.println("Character: " + character + ", Font: " + font);
    }
}
