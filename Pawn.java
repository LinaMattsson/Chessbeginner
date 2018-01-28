package chackSpel;

public class Pawn extends Piece{



    public Pawn(int x, int y, int color){
        super(x,y,color);
        figure='p';
    }
    public Piece[] moveWhitePawn(Piece[] w, Piece[]b){
        if(w[0]!=null) {
            int y = w[0].y;
            y--;
            w[0].y = y;
            System.out.println("Move white");
        }
        return w;
    }
    public Piece[] moveBlackPawn(Piece[]w,Piece[]b){
        if(b[0]!=null) {
            int y = b[0].y;
            y++;
            b[0].y = y;
            System.out.println("Move black");
        }
        return b;
    }

}
