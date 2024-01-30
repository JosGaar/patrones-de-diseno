package clases;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Josue
 */

// FlyweightFactory
public class LetterFactory {

    private Map<Character, ILetter> letterCache = new HashMap<>();

    public ILetter getLetter(char character) {
        // Reutilizar instancias existentes si est�n en la cach�
        return letterCache.computeIfAbsent(character, ConcreteLetter::new);
    }
}
