package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class CountDownScreen extends Container {
    private CardLayout cardLayout = new CardLayout();
    private JLabel countDownLabel = new JLabel("", SwingConstants.CENTER);


    public CountDownScreen(int startNum, int endNum, String bgFileName){
        //background
        Display.bgPanel[startNum] = new JPanel();
        Display.bgPanel[startNum].setBounds(0, 0, 1310, 715);
        Display.bgPanel[startNum].setLayout(null);
        ImageIcon bgStartIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName)); // เพิ่มBackground
        Display.bgLabel[startNum].setIcon(bgStartIcon);
        Display.window.add(Display.bgPanel[startNum]);

        Display.bgPanel[endNum] = new JPanel();
        //Display.bgPanel[endNum].setBounds(0, 0, 1310, 715);
        //Display.bgPanel[endNum].setLayout(null);
        //ImageIcon bgEndIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName)); // เพิ่มBackground
        //Display.bgLabel[endNum].setIcon(bgEndIcon);
        //Display.window.add(Display.bgPanel[endNum]);

        JLabel startLabel = new JLabel(" START AT");
        Font font = new Font("CatchyMelodyRegular-owA1o.ttf", Font.PLAIN, 45);
        startLabel.setFont(font);
    }


    /*public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Display.window.getContentPane().add(new CountDownScreen(startNum, endNum, ));
                Display.window.setLocationRelativeTo(null);
                Display.window.setVisible(true);
            }
        });
    }
    */

    public void setCountDownLabelText(String text) {
        countDownLabel.setText(text);
    }

    public void showNextPanel() {
        cardLayout.next(this);
    }
}

class HurdlerTimer {
    private static final int TIMER_PERIOD = 1000;
    protected static final int MAX_COUNT = 3;
    private CountDownScreen cdScreen; // holds a reference to the Welcome class
    private int count;

    public HurdlerTimer(CountDownScreen cdScreen) {
        this.cdScreen = cdScreen; // initializes the reference to the Welcome class.
        String text = (MAX_COUNT - count) + "/n SECONDS";
        cdScreen.setCountDownLabelText(text);
    }

    public void start() {
        new Timer(TIMER_PERIOD, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < MAX_COUNT) {
                    count++;
                    String text = "(" + (MAX_COUNT - count) + ") seconds left";
                    cdScreen.setCountDownLabelText(text); // uses the reference to Welcome
                } else {
                    ((Timer) e.getSource()).stop();
                    cdScreen.showNextPanel();
                }
            }
        }).start();
    }

}



