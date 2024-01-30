package clases;

/**
 *
 * @author Josue
 */

// ConcreteImplementorA
public class Speakers implements IAudioDevice {
    
    @Override
    public void playAudio(String audio) {
        System.out.println("Playing audio throught speakers: " + audio);
    }
}
