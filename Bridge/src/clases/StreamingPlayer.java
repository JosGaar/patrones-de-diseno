package clases;

/**
 *
 * @author Josue
 */

// RefinedAbstractionB
public class StreamingPlayer extends MediaPlayer {

    public StreamingPlayer(IAudioDevice audioDevice) {
        super(audioDevice);
    }
    
    @Override
    public void play(String audio) {
        System.out.println("Streaming Player is playing:");
        audioDevice.playAudio(audio);
    }
}
