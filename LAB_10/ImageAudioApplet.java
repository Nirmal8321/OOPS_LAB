// LAB_10 Q2 - Applet: getImage() and play audio clip in loop
// Place image/audio in same dir or use getCodeBase()
import java.applet.*;
import java.awt.*;

public class ImageAudioApplet extends Applet {
    Image img;
    AudioClip clip;

    public void init() {
        img = getImage(getCodeBase(), "image.gif");  // use your image file name
        clip = getAudioClip(getCodeBase(), "audio.wav");  // use your audio file
        if (clip != null) clip.loop();
    }

    public void paint(Graphics g) {
        if (img != null) g.drawImage(img, 0, 0, this);
        else g.drawString("No image (add image.gif)", 10, 20);
    }

    public void stop() {
        if (clip != null) clip.stop();
    }
}
