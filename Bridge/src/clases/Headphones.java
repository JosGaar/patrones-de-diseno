package clases;

/**
 *
 * @author Josue
 */

// ConcreteImplementorB
public class Headphones implements IAudioDevice {
    
    @Override
    public void playAudio(String audio) {
        System.out.println("Playing audio throught headphones: " + audio);
    }
}
