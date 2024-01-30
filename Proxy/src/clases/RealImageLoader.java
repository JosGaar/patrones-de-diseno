package clases;

import java.awt.Image;
import java.net.URL;

/**
 *
 * @author Josue
 */

// RealSubject
public class RealImageLoader implements ImageLoader {

    private URL imageUrl;

    public RealImageLoader(URL imageUrl) {
        this.imageUrl = imageUrl;
        // Lógica para cargar la imagen desde la URL (puede ser costoso)
        System.out.println("Loading image from: " + imageUrl);
    }

    @Override
    public Image loadImage() {
        // Lógica para cargar y devolver la imagen (en este ejemplo, simplemente se imprime un mensaje)
        System.out.println("Image loaded from: " + imageUrl);
        return null; // En una implementación real, se devolvería la imagen cargada
    }
}
