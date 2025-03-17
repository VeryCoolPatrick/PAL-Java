public class Prawn extends ChessPiece {
    public Prawn(int startingX, int startingY, Colour pieceColour) {
        super(startingX, startingY, pieceColour);
    }

    @Override public boolean checkMove(int newX, int newY) {
        if(newX < 0 || newX >= Constants.BOARD_WIDTH) return false;
        if(newY < 0 || newY >= Constants.BOARD_WIDTH) return false;
        if(newX != getX() - 1 && newX != getX() + 1) return false;
        if(newY != getY() + 1) return false;
        return true;
    }

}
