import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ChessPiece myPawn = new Pawn(0, 0, Colour.WHITE);
        ChessPiece myPrawn = new Prawn(0, 0, Colour.WHITE);
        myPawn.move(1, 1);
        myPrawn.move(1, 1);

        if(myPawn instanceof SpecialMover) {
            ((SpecialMover) myPawn).specialMove(0, 2);
        }

        if(myPrawn instanceof SpecialMover) {
            ((SpecialMover) myPrawn).specialMove(0, 2);
        }

//        Colour patricksFavourite = Colour.BLACK;
//
//        if(patricksFavourite == Colour.BLACK) {
//            System.out.println("Ew, what a goth.");
//        } else {
//            System.out.println("I dont like black either");
//        }

    }
}