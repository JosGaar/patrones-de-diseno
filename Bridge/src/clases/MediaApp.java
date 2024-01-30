package clases;

/**
 *
 * @author Josue
 */

// Cliente
public class MediaApp {

    public static void main(String[] args) {
        // Crear implementaciones concretas de AudioDevice
        IAudioDevice speakers = new Speakers();
        IAudioDevice headphones = new Headphones();

        // Crear reproductores de medios y asignarles una implementación de AudioDevice
        MediaPlayer mp3Player = new MP3Player(speakers);
        MediaPlayer streamingPlayer = new StreamingPlayer(headphones);

        // Utilizar los reproductores de medios para reproducir audio
        mp3Player.play("Song1.mp3");
        System.out.println();
        streamingPlayer.play("PodcastEpisode.mp3");
    }
}
