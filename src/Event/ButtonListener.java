package Event;

import Bingo.BingoGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    BingoGame bingoGame;
    public ButtonListener(BingoGame bingoGame) {
        this.bingoGame = bingoGame;
    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();

        if (source == bingoGame.bingoButton) { //checks if the human grid has won
            if (!bingoGame.winner) {
                if (bingoGame.daysGrid.checkWin()) {
                    bingoGame.daysGrid.setWinnerMessage("BINGO");
                    bingoGame.winner = true;

                    //auto reset
                    bingoGame.daysGrid.initializeGrid();
                    bingoGame.bingoNumbers.numbers.clear();
                    bingoGame.winner = false;
                } else {
                    bingoGame.daysGrid.setWinnerMessage("END OF ROUND.");
                }
            }
        }
        //bingoGame.daysGrid.repaint();
        bingoGame.bingoNumbers.repaint();
    }

}
