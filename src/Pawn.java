import java.awt.*;

public class Pawn extends ChessPiece {
    public Pawn(int startingX, int startingY, Colour pieceColour) {
        super(startingX, startingY, pieceColour);
    }

    @Override public boolean checkMove(int newX, int newY) {
        if(newX != super.getX()) return false;
        if(newY != super.getY() + 1) return false;
        if(newY >= Constants.BOARD_WIDTH) return false;
        return true;
    }
}
