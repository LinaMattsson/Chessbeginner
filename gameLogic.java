package chackSpel;

public class gameLogic {
    Board board=new Board();


    public void uppdateBoard(Piece[] mover, Piece[] enemy, Board board) {// uppdates the board with all pieces
        this.board=board;
        for (int i = 0; i < mover.length; i++) {    //updates all de actic players pieces
            if(mover[i]!=null) {
                int x = mover[i].x;
                int y = mover[i].y;
                char a = mover[i].figure;
                int color = mover[i].color;
                Pawn forNow = new Pawn(x, y, color);    //temporary Pawn to put in the board array.
                board.setPieceInPosition(forNow, x, y);
            }
        }
        for (int j = 0; j < enemy.length; j++) {    //Updates all pieces for the non activ player in the board array
            if(enemy[j]!=null){                     // If a place is ocupied, the piece is deleted.
                int x1 = enemy[j].x;
                int y1 = enemy[j].y;
                char a1 = enemy[j].figure;
                int color1 = enemy[j].color;
                Pawn forNow1 = new Pawn(x1, y1, color1);
                if (board.getPieceInPosition(x1, y1) == null) {
                        board.setPieceInPosition(forNow1, x1, y1);
                }
                else {
                    enemy[j] = null;                       // Even the pawn in the player array will be removed.
                    System.out.println(" null, pjäs tagen");
                }
            }
        }
    }
}
