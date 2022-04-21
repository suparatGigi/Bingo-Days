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
<<<<<<< Updated upstream
        if (source == reset) {
            bingoGame.daysGrid.initializeGrid();
            bingoGame.bingoNumbers.numbers.clear();
            bingoGame.winner = false;
        } else if (source == bingo) { //checks if the human grid has won
            if (!bingoGame.winner) {
                if (bingoGame.daysGrid.checkWin()) {
                    bingoGame.daysGrid.setWinnerMessage("WINNER: HUMAN");
                    bingoGame.winner = true;
                } else {
                    bingoGame.daysGrid.setWinnerMessage("Sorry, you haven't gotten bingo.");
                }
            }
        }//  else if (source == start) { //starts the game
        // startGame = true; }
=======
        if (source == reset) { //resets the boards and the bingo number callings
            bingoGame.daysGrid.initializeGrid();
            bingoGame.bingoNumbers.numbers.clear();
            bingoGame.winner = false;
        } else if (source == bingoGame.bingoButton) { //checks if the human grid has won
            if (!bingoGame.winner) {
                if (bingoGame.daysGrid.checkWin()) {
                    bingoGame.daysGrid.setWinnerMessage("BINGO");
                    bingoGame.winner = true;
                } else {
                    bingoGame.daysGrid.setWinnerMessage("END OF ROUND");
                }
            }
        }
        else if (source == start) { //starts the game
            startGame = true;
        } else if (source == stop) { //stops/pauses the game
            startGame = false;
        }
>>>>>>> Stashed changes
        bingoGame.daysGrid.repaint();
        bingoGame.bingoNumbers.repaint();
        //layout.repaint();
    }
<<<<<<< Updated upstream
    }


=======
}
>>>>>>> Stashed changes
