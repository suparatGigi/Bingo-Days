package Event;

import Main.BingoGame;

import java.awt.event.ActionEvent;

public class ButtonListener {

    private BingoGame bingoGame;
    public ButtonListener(BingoGame bingoGame) {
        this.bingoGame = bingoGame;
    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == reset) {
            daysGrid.initializeGrid();
            bingoNumbers.number.clear();
            winner = false;
        } else if (source == bingo) { //checks if the human grid has won
            if (!winner) {
                if (humanGrid.checkWin()) {
                    humanGrid.setWinnerMessage("WINNER: HUMAN");
                    winner = true;
                } else {
                    humanGrid.setWinnerMessage("Sorry, you haven't gotten bingo.");
                }
            }
        }//  else if (source == start) { //starts the game
        // startGame = true; }
        daysGrid.repaint();
        bingoGame.bingoNumbers.repaint();
        //layout.repaint();
    }
    }


