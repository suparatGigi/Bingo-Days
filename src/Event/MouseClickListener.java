package Event;

import Main.BingoGame;
import Main.BingoGridDays;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseClickListener implements MouseListener {
    BingoGame bingo;

    public MouseClickListener(BingoGame bingo){
        this.bingo = bingo;
    }
    @Override
    public void mousePressed(MouseEvent event){
        int x = event.getX();
        int y = event.getY();
//        daysGrid.highlightSqurare(x, y);
    }
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}