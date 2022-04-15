/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 *
 */

public class Display {
    String day;
    GameManager gm;
    JFrame window;
    public JPanel bgPanel[] = new JPanel[14]; //window 6 หน้า
    public JLabel bgLabel[] = new JLabel[14];
    
    public Display(GameManager gm){
        this.gm = gm;
        
        createMainField();
        generateScreen();
        
        window.setVisible(true); //ทำให้window มองเห็นได้
        
    }

    public void createMainField(){
        window = new JFrame();
        window.setSize(1295, 750); //ขนาดหน้าต่าง
        window.setResizable(false);
        window.setTitle("Bingo Days Game"); //ชื่อบนหัวหน้าต่าง
        
        //กดปิดwindow
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Background
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
    }
    
    public void createBackground(int bgNum, String bgFileName){
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(0, 0, 1310, 715); //ขนาดรูป
        bgPanel[bgNum].setBackground(Color.black);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[bgNum]);
        
        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0, 0, 1310, 715);
        
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName)); // เพิ่มBackground
        bgLabel[bgNum].setIcon(bgIcon);
        
        //bgPanel[bgNum].add(bgLabel[1]);
    }
    
    public void createNextButton(int bgNum, int x, int y, int width, int height, String buttonName, String command){
        JButton button = new JButton();
        button.setBounds(x, y, width, height);
        button.setBackground(null);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        //button.setLocation(x:360, y:256);
        
        
        ImageIcon buttonIcon = new ImageIcon(getClass().getClassLoader().getResource(buttonName)); // เพิ่มรูปปุ่ม
        button.setIcon(buttonIcon);
        
        button.addActionListener(gm.aHandler);
        button.setActionCommand(command);
        
        
        bgPanel[bgNum].add(button);
    }
    
    public void generateScreen(){
        //SCREEN1 logo game + start + howTOplay
        createBackground(1, "Bg1.png");
        createNextButton(1, 550, 450, 200, 89, "startButton.png", "goScreen3");
        createNextButton(1, 480, 560, 350, 87, "howTOplaybutton.png", "goScreen2");
        createNextButton(1, 1180, 4, 90, 88, "Xbutton.png", "goScreen1");
        bgPanel[1].add(bgLabel[1]);
       
        //SCREEN2 howTOwin
        createBackground(2, "Bg2.png");
        //createNextButton(2, 560, 580, 200, 67, "continueButton.png", "goScreen3");
        createNextButton(2, 1180, 4, 90, 88, "Xbutton.png", "goScreen1");
        bgPanel[2].add(bgLabel[2]);
    
        //SCREEN3 Mon-Sun stage
        createBackground(3, "Bg3.png");
        createNextButton(3, 150, 130, 200, 248, "mon.png", "goScreen7");
        createNextButton(3, 400, 130, 200, 248, "tue.png", "goScreen8");
        createNextButton(3, 650, 130, 200, 248, "wed.png", "goScreen9");
        createNextButton(3, 900, 130, 200, 248, "thu.png", "goScreen10");
        createNextButton(3, 300, 390, 200, 248, "fri.png", "goScreen11");
        createNextButton(3, 550, 390, 200, 248, "sat.png", "goScreen12");
        createNextButton(3, 800, 390, 200, 248, "sun.png", "goScreen13");
        createNextButton(3, 1090, 3, 90, 88, "rebutton.png", "goScreen1");
        createNextButton(3, 1180, 4, 90, 88, "Xbutton.png", "goScreen1");
        bgPanel[3].add(bgLabel[3]);
        
        //SCREEN4 not use
        createBackground(4, "grey1.png");
        createNextButton(4, 150, 50, 985, 594, "congrats.png", "goScreen3");
        createNextButton(4, 1090, 3, 90, 88, "rebutton.png", "goScreen6"); //test
        bgPanel[4].add(bgLabel[4]);
        
        //SCREEN5 congrats
        createBackground(5, "grey1.png");
        createNextButton(5, 150, 50, 985, 594, "congrats.png", "goScreen3");
        createNextButton(5, 1090, 3, 90, 88, "rebutton.png", "goScreen6"); //test
        bgPanel[5].add(bgLabel[5]);
        
        //SCREEN6 failed
        createBackground(6, "grey1.png");
        createNextButton(6, 380, 170, 650, 436, "fail copy.png", "goScreen3");
        createNextButton(6, 1090, 3, 90, 88, "rebutton.png", "goScreen7");  //teat
        bgPanel[6].add(bgLabel[6]);
        
        //SCREEN7 mon box about ball left and sccore will you get
        createBackground(7, "d11.png");
        createNextButton(7, 1090, 3, 90, 88, "rebutton.png", "goScreen3");
        createNextButton(7, 1180, 4, 90, 88, "Xbutton.png", "goScreen1");
        createNextButton(7, 60, 610, 200, 89, "bingoButton.png", "goScreen5");
        bgPanel[7].add(bgLabel[7]);
        
        //SCREEN8 tue box about ball left and sccore will you get
        createBackground(8, "d2.png");
        createNextButton(8, 1090, 3, 90, 88, "rebutton.png", "goScreen3");
        createNextButton(8, 1180, 4, 90, 88, "Xbutton.png", "goScreen1");
        createNextButton(8, 60, 610, 200, 89, "bingoButton.png", "goScreen5");
        bgPanel[8].add(bgLabel[8]);
        
        //SCREEN9 wed box about ball left and sccore will you get
        createBackground(9, "d3.png");
        createNextButton(9, 1090, 3, 90, 88, "rebutton.png", "goScreen3");
        createNextButton(9, 1180, 4, 90, 88, "Xbutton.png", "goScreen1");
        createNextButton(9, 60, 610, 200, 89, "bingoButton.png", "goScreen5");
        bgPanel[9].add(bgLabel[9]);
        
        //SCREEN10 thu box about ball left and sccore will you get
        createBackground(10, "d4.png");
        createNextButton(10, 1090, 3, 90, 88, "rebutton.png", "goScreen3");
        createNextButton(10, 1180, 4, 90, 88, "Xbutton.png", "goScreen1");
        createNextButton(10, 60, 610, 200, 89, "bingoButton.png", "goScreen5");
        bgPanel[10].add(bgLabel[10]);
        
        //SCREEN11 fri box about ball left and sccore will you get
        createBackground(11, "d5.png");
        createNextButton(11, 1090, 3, 90, 88, "rebutton.png", "goScreen3");
        createNextButton(11, 1180, 4, 90, 88, "Xbutton.png", "goScreen1");
        createNextButton(11, 60, 610, 200, 89, "bingoButton.png", "goScreen5");
        bgPanel[11].add(bgLabel[11]);
        
        //SCREEN12 sat box about ball left and sccore will you get
        createBackground(12, "d6.png");
        createNextButton(12, 1090, 3, 90, 88, "rebutton.png", "goScreen3");
        createNextButton(12, 1180, 4, 90, 88, "Xbutton.png", "goScreen5");
        createNextButton(12, 60, 610, 200, 89, "bingoButton.png", "goScreen1");
        bgPanel[12].add(bgLabel[12]);
        
        //SCREEN13 sun box about ball left and sccore will you get
        createBackground(13, "d7.png");
        createNextButton(13, 1090, 3, 90, 88, "rebutton.png", "goScreen3");
        createNextButton(13, 1180, 4, 90, 88, "Xbutton.png", "goScreen1");
        createNextButton(13, 60, 610, 200, 89, "bingoButton.png", "goScreen5");
        bgPanel[13].add(bgLabel[13]);
        
        
    }

}
