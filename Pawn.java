package chessGame;

public class Pawn extends Piece {


    public Pawn(int x, int y, int color) {
        super(x, y, color);
        figure = 'p';
    }

    public Piece[] moveWhitePawn(Piece[] w, Piece[] b) {
        for (int i = 1; i < 9; i++) {
            if (w[i] != null && w[i].y!=0) {
                int y = w[i].y;
                if (y == 6) {
                    y -= 2;
                } else {
                    y--;
                }
                w[i].y = y;
                System.out.println("Move white");
                return w;
            }
        }
        return w;
    }

    public Piece[] moveBlackPawn(Piece[] w, Piece[] b) {
        for (int i = 1; i < 9; i++) {
            if (b[i] != null &&w[i].y!=7) {
                int y = b[i].y;
                if (y == 1) {
                    y += 2;
                } else {
                    y++;
                }
                b[i].y = y;
                System.out.println("Move black");
                return b;
            }
        }
        return b;
    }
}
