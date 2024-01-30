package clases;

/**
 *
 * @author Josue
 */
// Client
public class DocumentEditor {

    public static void main(String[] args) {
        LetterFactory letterFactory = new LetterFactory();

        // El cliente utiliza letras compartidas a través de la fábrica
        ILetter letterA = letterFactory.getLetter('A');
        ILetter letterB = letterFactory.getLetter('B');
        ILetter letterA2 = letterFactory.getLetter('A'); // Se reutiliza la instancia existente

        // El cliente puede imprimir las letras con diferentes fuentes
        letterA.print("Arial");
        letterB.print("Times New Roman");
        letterA2.print("Verdana");
    }
}
