package Event;

import Main.BingoGame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerHandler implements ActionListener {
    BingoGame bingoGame;

    public TimerHandler(BingoGame bingoGame){
        this.bingoGame = bingoGame;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if (bingoGame.startGame && !bingoGame.winner){
            bingoGame.bingoNumbers.generateNumber();
            bingoGame.daysGrid.isCalled();
            bingoGame.daysGrid.setWinnerMessage(""); /// มาเปลี่ยนที่หลัง
            bingoGame.bingoNumbers.repaint();

        }
    }
}
