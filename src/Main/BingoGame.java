package Main;


import javax.swing.*;
<<<<<<< Updated upstream
import java.awt.*;
=======
>>>>>>> Stashed changes
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
<<<<<<< Updated upstream
import Event.ButtonListener;
import Event.MouseClickListener;
import Event.TimerHandler;

public class BingoGame {
    public static final int WIDTH = 900;
    public static final int LENGTH = 700;

    public MouseClickListener mouse = new MouseClickListener;
    public ButtonListener button = new ButtonListener(this);
    public TimerHandler timer = new TimerHandler(this);

=======

public class BingoGame extends JFrame {
>>>>>>> Stashed changes
    private BingoNumbers bingoNumbers;
    private BingoGrid dummyGrid;
    public BingoGridDays daysGrid;

    private MouseListener mouseListener;
    private ActionListener timer;
    private ActionListener buttonListener;
    private final int DELAY;
<<<<<<< Updated upstream
    private boolean startGame = true;
    public boolean winner = false;

    private JLabel countDownLabel = new JLabel("", SwingConstants.CENTER);
    private CardLayout cardLayout = new CardLayout();


    public BingoGame(int bgNum, String bgFileName) {

        createBingoBackgroud(bgNum, bgFileName)
        createBingoButton(bgNum);

        mouseListener = new Event.MouseClickListener();
        timer = new Timer();
=======
    private boolean startGame = false;
    private boolean winner = false;


    public BingoGame() {
        createBingoButton();

        mouseListener = new MouseListener();
        timer = (ActionListener) new Timer();
>>>>>>> Stashed changes
        DELAY = 2500;
        Timer t = new Timer(DELAY, timer);
        t.start();

<<<<<<< Updated upstream
        Main.Display.bgPanel[bgNum].add(daysGrid);
        Main.Display.bgPanel[bgNum].setVisible(true);

        Main.Display.bgPanel[bgNum].add(bingoNumbers);
        Main.Display.bgPanel[bgNum].setVisible(true);

        daysGrid.addMouseListener(bingo.mouse);
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
=======
        /*add(daysGrid);
        setVisible(true);

        add(bingoNumbers);
        setVisible(true);

        daysGrid.addMouseListener(mouseListener);
        setVisible(true);

         */
    }

    public void createBingoButton() {
>>>>>>> Stashed changes
        JButton bingoButton = new JButton();
        bingoButton.setBounds(500, 600, 200, 89);
        bingoButton.setBackground(null);
        bingoButton.setContentAreaFilled(false);
        bingoButton.setFocusPainted(false);
        bingoButton.setBorderPainted(false);

<<<<<<< Updated upstream
        bingoButton.setToolTipText("I HAVE BINGO");

        ImageIcon buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/bingoButton.png")); // เพิ่มรูปปุ่ม
        bingoButton.setIcon(buttonIcon);

        buttonListener = new Event.ButtonListener();
        bingoButton.addActionListener(buttonListener);

        Main.Display.bgPanel[bgNum].add(bingoButton);
    }




}

=======
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
    }
    class MouseClickListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {}
        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            daysGrid.highlightSquare(x, y);
        }
        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}

        }
    }
>>>>>>> Stashed changes





