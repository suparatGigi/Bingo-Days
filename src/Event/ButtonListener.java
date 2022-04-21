package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        // check if bingo win
        if (source == bingo) {
            if(!winner) {
                if(daysGrid.checkwin()){
                    daysGrid.setWinnerMessage("BINGO"); ///แก้
                    winner = true;
                } else {
                    daysGrid.setWinnerMessage("END OF ROUND"); ///แก้
                }
            }
        }
    }
}
