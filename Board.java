package chessGame;

public class Board {
    public Piece [][] board;

    public Board(){
        board = new Piece[8][8];
    }

    public void clear(Piece [][] board, Piece[] w, Piece []b){
        this.board=board;
        for (int i = 0; i <w.length ; i++) {
            if(w[i]!=null){
            setPieceInPosition(null,w[i].x, w[i].y);}
            if(b[i]!=null){
            setPieceInPosition(null,b[i].x, b[i].y);}
        }
    }
    public Piece getPieceInPosition(int x, int y){
        Piece p=board[x][y];
        return p;
    }
    public void setPieceInPosition(Piece p, int x, int y){
        board[x][y]=p;
        //p.getX();
    }
    public boolean gameOver(Piece[] w, Piece [] b){
        boolean gameOn;
        if(w[0]==null && w[1]==null && w[2]==null){
            System.out.println("Black win");
            gameOn=false;
        }
        else if(w[0]==null && w[1]==null && w[2]==null){
            System.out.println("White win");
            gameOn=false;
        }
        else
            gameOn=true;
        return gameOn;
    };
}
