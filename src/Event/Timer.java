package Event;

import Main.BingoGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer implements ActionListener {
    BingoGame bingo;

    public Timer(BingoGame bingo){
        this.bingo = bingo;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if (starGame && !winner){
            bingoNumbers.generateNumber();
            daysGrid.isCalled();
            daysGrid.setWinnerMessage(""); /// มาเปลี่ยนที่หลัง
            bingoNumbers.repaint();

        }
    }
}
