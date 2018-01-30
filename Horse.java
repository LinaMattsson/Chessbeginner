package chessGame;

public class Horse extends Piece {


    public Horse(int x, int y, int color) {
        super(x, y, color);
        figure = 'h';
    }

    public Piece[] moveWhiteHorse(Piece[] w, Piece[] b) {
        if (w[0] != null) {
            int x = w[0].x;
            int y = w[0].y;
            y -= 2;
            x -= 1;
            if(x>=0&&x<8&&y>=0&&y<8){
            w[0].x = x;
            w[0].y = y;
            return w;}
            else{
                y+=3;
                x+=3;
                w[0].x = x;
                w[0].y = y;
                return w;
            }}

        return w;
    }

    public Piece[] moveBlackHourse(Piece[] w, Piece[] b) {
        if (b[0] != null) {
            int x = b[0].x;
            int y = b[0].y;
            x += 1;
            y += 2;
            if(x>=0&&x<8&&y>=0&&y<8){
            b[0].x = x;
            b[0].y = y;
            return b;
            }
            else{
                y-=3;
                x-=3;
                w[0].x = x;
                w[0].y = y;
                return b;
                }
        }
        return b;
    }
}
