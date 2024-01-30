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
        // Reutilizar instancias existentes si están en la caché
        return letterCache.computeIfAbsent(character, ConcreteLetter::new);
    }
}
