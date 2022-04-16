/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

//import java.net.URL;

import java.net.URL;


/**
 *
 * 
 */
public class GameManager {
    
     ActionHandler aHandler = new ActionHandler(this);
    
    public Display dp = new Display(this);
    
    public ScreenChanger sChanger = new ScreenChanger(this);
    
    Music music = new Music();
    Sound sound = new Sound();
    
    public URL fieldMusic = getClass().getClassLoader().getResource("audio//sound.wav");
    public URL currentMusic;
   
    public static void main(String[] args) {
        new GameManager();
    }
    
    public GameManager() {
        currentMusic = fieldMusic;
        playMusic(currentMusic);
        
        sChanger.showScreen1();
        
    }
    
    public void playSound(URL url) {
        sound.setFile(url);
        sound.play(url);
    }
    
    public void playMusic(URL url) {
        music.setFile(url);
        music.play(url);
        music.loop(url);
    }

    public void stopMusic(URL url) {
        music.stop(url);
    }


}

