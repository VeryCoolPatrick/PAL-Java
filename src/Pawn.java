import java.awt.*;
import java.io.Serializable;

public class Pawn extends ChessPiece implements SpecialMover {
    public Pawn(int startingX, int startingY, Colour pieceColour) {
        super(startingX, startingY, pieceColour);
    }

    @Override public boolean checkMove(int newX, int newY) throws Exception {
        if(newX != super.getX()) throw new MoveException("Illegal Move");
        if(newY != super.getY() + 1) throw new MoveException("Illegal Move");
        if(newY >= Constants.BOARD_WIDTH) throw new MoveException("Illegal Move");
        return true;
    }

    @Override
    public boolean specialMove(int newX, int newY) {
        if(newX != super.getX()) return false;
        if(newY != super.getY() + 2) return false;
        if(newY >= Constants.BOARD_WIDTH) return false;
        System.out.println("You can make the special move.");
        return true;
    }
}
