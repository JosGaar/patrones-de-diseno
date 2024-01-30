package clases;

import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Josue
 */

// Client
public class ImageLoadingClient {

    public static void main(String[] args) throws MalformedURLException {

        // Crear un proxy para cargar la imagen desde la web
        ImageLoader imageLoader = new ImageLoaderProxy(new URL("https://example.com/image.jpg"));

        // El cliente interactúa con el proxy, que carga la imagen solo cuando es necesario
        Image image = imageLoader.loadImage();
    }
}
