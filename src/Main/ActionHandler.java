/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * 
 */
public class ActionHandler implements ActionListener {
    หด้เด้เด
    GameManager gm;
    
    public ActionHandler(GameManager gm){
        this.gm = gm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        //เปลี่ยนหน้า
        switch(choice){

            case "goScreen1" : gm.sChanger.showScreen1(); break;
            case "goScreen2" : gm.sChanger.showScreen2(); break;
            case "goScreen3" : gm.sChanger.showScreen3(); break;
            case "goScreen4" : gm.sChanger.showScreen4(); break;
            case "goScreen5" : gm.sChanger.showScreen5(); break;
            case "goScreen6" : gm.sChanger.showScreen6(); break;
            case "goScreen7" : gm.sChanger.showScreen7(); break;   
            case "goScreen8" : gm.sChanger.showScreen8(); break;
            case "goScreen9" : gm.sChanger.showScreen9(); break;
            case "goScreen10" : gm.sChanger.showScreen10(); break;
            case "goScreen11" : gm.sChanger.showScreen11(); break;
            case "goScreen12" : gm.sChanger.showScreen12(); break;
            case "goScreen13" : gm.sChanger.showScreen13(); break;   
            
            
        }

        
        
    }
    
    
    
}
