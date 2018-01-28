package chackSpel;

public class Piece {
    int x;
    int y;
    int color;
    char figure;

    private Piece(){
    }

    public Piece(int x, int y, int color){
        this.x=x;
        this.y=y;
        this.color = color;
    }
    public boolean moveAllowed(){

        return true;
    }


}
