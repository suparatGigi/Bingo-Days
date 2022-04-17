package Main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BingoGame {
    private MouseClickListener mouseListener;
    private ActionListener timer;
    private ActionListener buttonListener;
    private final int DELAY;


    public BingoGame(GameManager gm){
        createBingoButton();

        MouseClickListener mouseListener = new MouseClickListener();
        timer = (ActionListener) new Timer();
        DELAY = 2500;
        Timer t = new Timer(DELAY, timer);
        t.start();

        add(daysGrid);
        setVisible(true);

        add(bingoNumbers);
        setVisible(true);

        daysGrid.addMouseListener(mouseListener);
        setVisible(true);
    }

    public void createBingoButton() {
        JButton bingoButton = new JButton();
        bingoButton.setBounds(500, 600, 200, 89);
        bingoButton.setBackground(null);
        bingoButton.setContentAreaFilled(false);
        bingoButton.setFocusPainted(false);
        bingoButton.setBorderPainted(false);

        ImageIcon buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/bingoButton.png")); // เพิ่มรูปปุ่ม
        bingoButton.setIcon(buttonIcon);

        ActionHandler aHandler = new ActionHandler();
        bingoButton.addActionListener(aHandler);
    }





\
