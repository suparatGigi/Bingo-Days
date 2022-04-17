package Main;

public class Timer {
    class Timer implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (startGame && !winner) {
                bingoNumbers.generateNumber();
                daysGrid.isCalled();
                daysGrid.setWinnerMessage("");
                bingoNumbers.repaint();
            }
        }
    }
}
