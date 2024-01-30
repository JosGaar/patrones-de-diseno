package clases;

/**
 *
 * @author Josue
 */

// RefinedAbstractionA
public class MP3Player extends MediaPlayer {
    
    public MP3Player(IAudioDevice audioDevice) {
        super(audioDevice);
    }
    
    @Override 
    public void play(String audio) {
        System.out.println("MP3 Player is playing: ");
        audioDevice.playAudio(audio);
    }
}
