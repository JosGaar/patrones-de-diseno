package clases;

/**
 *
 * @author Josue
 */

// Abstraction
public abstract class MediaPlayer {
    
    protected IAudioDevice audioDevice;
    
    protected MediaPlayer(IAudioDevice audioDevice) {
        this.audioDevice = audioDevice;
    }
    
    public abstract void play(String audio);
}
