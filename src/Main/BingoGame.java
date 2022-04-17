package Main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BingoGame {
    private BingoNumbers bingoNumbers;
    private BingoGrid dummyGrid;
    private BingoGridDays daysGrid;

    private MouseClickListener mouseListener;
    private ActionListener timer;
    private ActionListener buttonListener;
    private final int DELAY;
    private boolean startGame = false;
    private boolean winner = false;


    public BingoGame(GameManager gm) {
        createBingoButton();

        MouseClickListener mouseListener = new MouseClickListener();
        timer = (ActionListener) new Timer();
        DELAY = 2500;
        Timer t = new Timer(DELAY, timer);
        t.start();

        /*add(daysGrid);
        setVisible(true);

        add(bingoNumbers);
        setVisible(true);

        daysGrid.addMouseListener(mouseListener);
        setVisible(true);

         */
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

        buttonListener = new ButtonListener();
        bingoButton.addActionListener(buttonListener);
    }

    class Timer implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Object source = event.getSource();
            if (startGame && !winner) {
                bingoNumbers.generateNumber();
                daysGrid.isCalled();
                daysGrid.setWinnerMessage("");
                bingoNumbers.repaint();
            }
        }
    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (source == bingo) { //checks if the human grid has won
                if (!winner) {
                    if (daysGrid.checkWin()) {
                        daysGrid.setWinnerMessage("WINNER: HUMAN");
                        winner = true;
                    } else {
                        daysGrid.setWinnerMessage("Sorry, you haven't gotten bingo.");
                    }
                }
        }
    }






