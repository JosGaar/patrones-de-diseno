package clases;

import java.awt.Image;
import java.net.URL;

/**
 *
 * @author Josue
 */

// Proxy
public class ImageLoaderProxy implements ImageLoader {

    private RealImageLoader realImageLoader;
    private URL imageUrl;

    public ImageLoaderProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public Image loadImage() {
        // Crear una instancia de RealImageLoader solo cuando sea necesario
        if (realImageLoader == null) {
            realImageLoader = new RealImageLoader(imageUrl);
        }

        // Llamar al método loadImage en el objeto RealSubject
        return realImageLoader.loadImage();
    }
}
