/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

//import java.net.URL;

/**
 *
 * 
 */
public class GameManager {
    
    ActionHandler aHandler = new ActionHandler(this);
    
    public Display dp = new Display(this);
    
    public ScreenChanger sChanger = new ScreenChanger(this);
    
    
    //public URL fileMusic = getClass().getClassLoader().getResources("audio//sound.wav");
    //public URL currentMusic;
   
    public static void main(String[] args) {
        new GameManager();
    }
    
    public GameManager() {
        sChanger.showScreen1();
        
        Sound ss = new Sound();
        ss.setFile(0);
        ss.play();
        ss.loop();
    }

}

