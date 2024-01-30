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
        // L�gica para cargar la imagen desde la URL (puede ser costoso)
        System.out.println("Loading image from: " + imageUrl);
    }

    @Override
    public Image loadImage() {
        // L�gica para cargar y devolver la imagen (en este ejemplo, simplemente se imprime un mensaje)
        System.out.println("Image loaded from: " + imageUrl);
        return null; // En una implementaci�n real, se devolver�a la imagen cargada
    }
}
