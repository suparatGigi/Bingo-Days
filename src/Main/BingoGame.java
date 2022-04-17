package Main;
<<<<<<< HEAD
=======

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BingoGame {


    public BingoGame(GameManager gm){
        createBingoButton();

        mouseListener = new MouseClickListener();
        timer = new MyTimer();
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





>>>>>>> d2fb25518a54cddbdf5a16bf03af4ab6f82c3f1d
