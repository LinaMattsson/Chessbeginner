package chessGame;

import java.util.Random;

public class Player {
    int color;
    public Player(int color){
        this.color=color;
    }

    public Piece[] move(Piece[] white, Piece[] black, int color ){
        this.color=color;
        Piece [] w=white;
        Piece [] b=black;

        Random rn= new Random();
        int whichP = (int)(Math.random()*2);
        System.out.println("random " +whichP);
        if(color==1){                                //whites turn
            if(whichP==0) {
                Pawn p = new Pawn(-1,-1,3);
                white = p.moveWhitePawn(w, b);
            }
            else if(whichP==1){
                Horse h = new Horse(-1,-1,3);
                white = h.moveWhiteHorse(w, b);
            }                                           //Sends in the two playae arrays

            return white;
        }
        else{
            if(whichP==0) {
                Pawn p = new Pawn(-1,-1,3);
                white = p.moveBlackPawn(w, b);
            }
            else if(whichP==1){
                Horse h = new Horse(-1,-1,3);
                white = h.moveBlackHourse(w, b);
            }              //Sends in the two playae arrays
            return black;
        }
    }
}
