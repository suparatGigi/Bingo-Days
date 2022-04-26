package Bingo;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import Event.ButtonListener;
import Event.MouseClickListener;
import Event.TimerHandler;
import Main.Display;

public class BingoGame {
    public static final int WIDTH = 900;
    public static final int LENGTH = 700;

    public JButton bingoButton;

    private MouseListener mouseListener;
    private ActionListener timer;
    private ActionListener buttonListener;
    private final int DELAY;

    public BingoNumbers bingoNumbers;
    public BingoGrid Grid;
    public BingoGridDays daysGrid;

    public boolean startGame = true;
    public boolean winner = false;


    public BingoGame(int bgNum, String bgFileName) {
        //create background
        createBingoBackgroud(9, "image/d11.png");
        /*
        Main.Display.bgPanel[bgNum] = new JPanel();
        Main.Display.bgPanel[bgNum].setBounds(0, 0, 1310, 715); //ขนาดรูป
        Main.Display.bgPanel[bgNum].setBackground(Color.black);
        Main.Display.bgPanel[bgNum].setLayout(null);
        Main.Display.window.add(Display.bgPanel[bgNum]);

        Display.bgLabel[bgNum] = new JLabel();
        Display.bgLabel[bgNum].setBounds(0, 0, 1310, 715);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName)); // เพิ่มBackground
        Display.bgLabel[bgNum].setIcon(bgIcon);
        //bgPanel[bgNum].add(bgLabel[1]);

         */

        //create bingo button
        JButton bingoButton = new JButton();
        bingoButton.setBounds(500, 600, 200, 89);
        bingoButton.setBackground(null);
        bingoButton.setContentAreaFilled(false);
        bingoButton.setFocusPainted(false);
        bingoButton.setBorderPainted(false);
        bingoButton.setToolTipText("I HAVE BINGO");

        ImageIcon buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/bingoButton.png")); // เพิ่มรูปปุ่ม
        bingoButton.setIcon(buttonIcon);
        buttonListener = (ActionListener) new ButtonListener(this);
        bingoButton.addActionListener(buttonListener);
        Display.bgPanel[bgNum].add(bingoButton);

        // Ball Time Handle
        timer = new TimerHandler(this);
        DELAY = 3500;
        Timer t = new Timer(DELAY, timer);
        t.start();

        daysGrid = new BingoGridDays();
        bingoNumbers = new BingoNumbers();

        Display.bgPanel[bgNum].add(daysGrid);
        Display.bgPanel[bgNum].setVisible(true);

        Display.bgPanel[bgNum].add(bingoNumbers);
        Display.bgPanel[bgNum].setVisible(true);

        mouseListener = new MouseClickListener(this);
        daysGrid.addMouseListener(mouseListener);
        Display.bgPanel[bgNum].setVisible(true);

    }

    public void createBingoBackgroud(int bgNum, String bgFileName) {
        Main.Display.bgPanel[bgNum] = new JPanel();
        Main.Display.bgPanel[bgNum].setBounds(0, 0, 1310, 715); //ขนาดรูป
        Main.Display.bgPanel[bgNum].setBackground(Color.black);
        Main.Display.bgPanel[bgNum].setLayout(null);
        Main.Display.window.add(Display.bgPanel[bgNum]);

        Display.bgLabel[bgNum] = new JLabel();
        Display.bgLabel[bgNum].setBounds(0, 0, 1310, 715);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName)); // เพิ่มBackground
        Display.bgLabel[bgNum].setIcon(bgIcon);


        //bgPanel[bgNum].add(bgLabel[1]);
    }

    public void createBingoButton(int bgNum) {
        JButton bingoButton = new JButton();
        bingoButton.setBounds(500, 600, 200, 89);
        bingoButton.setBackground(null);
        bingoButton.setContentAreaFilled(false);
        bingoButton.setFocusPainted(false);
        bingoButton.setBorderPainted(false);

        bingoButton.setToolTipText("I HAVE BINGO");

        ImageIcon buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/bingoButton.png")); // เพิ่มรูปปุ่ม
        bingoButton.setIcon(buttonIcon);

        Display.bgPanel[bgNum].add(bingoButton);
    }
}





