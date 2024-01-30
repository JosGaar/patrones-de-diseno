package clases;

/**
 *
 * @author Josue
 */

// Client
public class TextProcessor {

    public static void main(String[] args) {
        // Crear un objeto ConcreteComponent (PlainText)
        IText plainText = new PlainText("Hello, world!");

        // Aplicar decoradores para agregar funcionalidades (negrita y cursiva)
        IText boldItalicText = new BoldTextDecorator(new ItalicTextDecorator(plainText));

        // Mostrar el contenido resultante
        System.out.println("Original Text: " + plainText.getContent());
        String result = boldItalicText.getContent();
        System.out.println("Decorated Text: " + boldItalicText.getContent());
    }
}
