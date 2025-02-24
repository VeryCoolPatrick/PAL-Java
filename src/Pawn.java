import java.awt.*;

public class Pawn extends ChessPiece {
    public Pawn(int startingX, int startingY, String pieceColour) {
        super(startingX, startingY, pieceColour);
    }

    public boolean checkMove(int newX, int newY) {
        if(newX != super.getX()) return false;
        if(newY != super.getY() + 1) return false;
        if(newY >= 8) return false;
        return true;
    }
}
