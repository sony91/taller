package Vista;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;



public class audio{

    public audio() {
    }
    
    
    public void reproducir(){
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(new File("E:\\audio.wav")));
            sonido.start();
            sonido.loop(Clip.LOOP_CONTINUOUSLY);
            //sonido.loop(2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..!" + e);
                    
        }
    }    
}

/*
 *   AudioClip sonido;
 *   sonido = java.applet.Applet.newAudioClip(getClass().getResourse("/Audio/audio.wav"));
 *   sonido.play();  
*/