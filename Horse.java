package chackSpel;

public class Horse extends Piece {

    public Horse(int x, int y, int color) {
        super(x, y, color);
        figure = 'h';
    }

    public Piece[] moveWhiteHorse(Piece[] w, Piece[] b) {
        if (w[2] != null) {
            int x = w[2].x;
            int y = w[2].y;
            y -= 2;
            x -= 1;
            w[2].x = x;
            w[2].y = y;

            System.out.println("Move white");
        }
        return w;
    }

    public Piece[] moveBlackHourse(Piece[] w, Piece[] b) {
        if (b[2] != null) {
            int x = b[2].x;
            int y = b[2].y;
            x += 1;
            y += 2;
            b[2].x = x;
            b[2].y = y;
            System.out.println("Move black");
        }
        return b;
    }
}
