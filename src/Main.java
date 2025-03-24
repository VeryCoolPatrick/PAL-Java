import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {

//            int[] myArray = new int[3];
//
//            myArray[7] = 1;

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
        } catch (Exception e) {
            System.out.println("Generic exception Caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }





//        try {
//            System.out.println("Start of try block");
//            throw new Exception("This is an exception");
////            System.out.println("After my throw");
//        }
//        catch(Exception e) {
//            System.out.println("In the catch block");
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("The finaly block");
//        }


//        Colour patricksFavourite = Colour.BLACK;
//
//        if(patricksFavourite == Colour.BLACK) {
//            System.out.println("Ew, what a goth.");
//        } else {
//            System.out.println("I dont like black either");
//        }

    }
}