package Event;

import Main.BingoGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerHandler implements ActionListener {
    BingoGame bingo;

    public TimerHandler(BingoGame bingo){
        this.bingo = bingo;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if (bingo.startGame && !bingo.winner){
            bingo.bingoNumbers.generateNumber();
            bingo.daysGrid.isCalled();
            bingo.daysGrid.setWinnerMessage(""); /// มาเปลี่ยนที่หลัง
            bingo.bingoNumbers.repaint();

        }
    }
}
