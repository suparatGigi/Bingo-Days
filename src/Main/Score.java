package Main;


import javax.swing.*;

public class Score{
    public static int highScore = 0;
    public JLabel highScoreText;

    public Score(){
       highScoreText = new JLabel();

    }

    public void applyToScore(int amount){
        highScore += amount;
    }

    public int getScore(){
        return highScore;
    }

}
