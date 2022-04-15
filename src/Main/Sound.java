/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author gigi
 */
import javax.sound.sampled.*;
import java.net.URL;

public class Sound {
    Clip clip;
    URL soundURL[] = new URL[51]; 
    
    public Sound() {
        soundURL[0] = getClass().getResource("C:\\Users\\gigi\\Downloads\\Bingo Days\\Bingo Days\\src\\audio\\sound.wav");
        
    }
    
    public void setFile(int i) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception ignored) {}
    }
    
    public void play() { clip.start(); }
    public void loop() { clip.loop(Clip.LOOP_CONTINUOUSLY); }
    public void stop() { clip.stop(); }
}
