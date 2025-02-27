public class ChessPiece {
    private int x;
    private int y;
    private Colour colour;

    public int getX() { return x; }
    public int getY() { return y; }

    public boolean move(int newX, int newY) {
        if(checkMove(newX, newY) == false) {
            System.out.println("Invalid move");
            return false;
        }
        x = newX;
        y = newY;
        System.out.println("Good move");
        return true;
    }

    public boolean checkMove(int newX, int newY) {
        return false;
    }

    public ChessPiece(int startingX, int startingY, Colour pieceColour) {
        x = startingX;
        y = startingY;
        colour = pieceColour;
    }
}
