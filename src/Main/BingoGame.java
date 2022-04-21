package Main;


import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import Event.ButtonListener;
import Event.MouseClickListener;
import Event.TimerHandler;

public class BingoGame {

<<<<<<< Updated upstream
    public MouseClickListener mouse = new MouseClickListener;
    public ButtonListener button = new ButtonListener(this);
    public TimerHandler timeHandle = new TimerHandler(this);

    public BingoNumbers bingoNumbers;
    public BingoGrid dummyGrid;
    public BingoGridDays daysGrid;

    private MouseListener mouseListener;
    private ActionListener timer;
    private ActionListener buttonListener;
    private int DELAY;
=======
    public MouseListener mouseListener;
    public ActionListener buttonListener ;
    public ActionListener timer;
    public BingoNumbers bingoNumbers;
    public BingoGrid Grid;
    public BingoGridDays daysGrid;


    private final int DELAY;
>>>>>>> Stashed changes
    public boolean startGame = true;
    public boolean winner = false;


    public BingoGame(int bgNum, String bgFileName) {

        createBingoBackgroud(bgNum, bgFileName);
<<<<<<< Updated upstream
        createBingoButton(bgNum);


        ActionListener timer = new Timer();
        DELAY = 3500;
=======

        JButton start = new JButton();
        Main.Display.bgPanel[bgNum].add(start);
        start.addActionListener(bingoGame.buttonListener);

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
        Main.Display.bgPanel[bgNum].add(bingoButton);

        mouseListener = new MouseClickListener(this);
        timer = new TimerHandler(this);
        DELAY = 2500;
>>>>>>> Stashed changes
        Timer t = new Timer(DELAY, timer);
        t.start();

        daysGrid = new BingoGridDays();
        bingoNumbers = new BingoNumbers();

        Main.Display.bgPanel[bgNum].add(daysGrid);
        Main.Display.bgPanel[bgNum].setVisible(true);

        Main.Display.bgPanel[bgNum].add(bingoNumbers);
        Main.Display.bgPanel[bgNum].setVisible(true);

        daysGrid.addMouseListener(mouseListener);
        Main.Display.bgPanel[bgNum].setVisible(true);


    }

    public void createBingoBackgroud(int bgNum, String bgFileName){
        Main.Display.bgPanel[bgNum] = new JPanel();
        Main.Display.bgPanel[bgNum].setBounds(0, 0, 1310, 715); //ขนาดรูป
        Main.Display.bgPanel[bgNum].setBackground(Color.black);
        Main.Display.bgPanel[bgNum].setLayout(null);
        Main.Display.window.add(Display.bgPanel[bgNum]);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName)); // เพิ่มBackground
        Main.Display.bgLabel[bgNum].setIcon(bgIcon);

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



        Main.Display.bgPanel[bgNum].add(bingoButton);
    }




}






