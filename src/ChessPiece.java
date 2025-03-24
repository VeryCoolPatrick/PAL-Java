public class ChessPiece {
    private int x;
    private int y;
    private Colour colour;

    public int getX() { return x; }
    public int getY() { return y; }

    public boolean move(int newX, int newY) throws Exception {
        try {
            checkMove(newX, newY);
        } catch (MoveException e) {
            System.out.println("We found a move exception");
            System.out.println(e.getMessage());
            throw new Exception("I need help with the move exception");
        }
        x = newX;
        y = newY;
        System.out.println("Good move");
        return true;
    }

    public boolean checkMove(int newX, int newY) throws Exception {
        return false;
    }

    public ChessPiece(int startingX, int startingY, Colour pieceColour) {
        x = startingX;
        y = startingY;
        colour = pieceColour;
    }
}
