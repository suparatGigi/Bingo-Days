package Event;

import Main.BingoGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer implements ActionListener {
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
