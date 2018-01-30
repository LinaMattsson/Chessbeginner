package chessGame;

import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.Terminal;

public class LanternaScreen {

    public LanternaScreen(){
        }

    public void printScreen(Screen screen, Piece[]w, Piece[]b) throws InterruptedException{
        screen.startScreen();
        screen.clear();
        for (int i = 0; i <9 ; i++) {
            if(w[i]!=null && i>0) {
                int x = w[i].x;
                int y = w[i].y;
                screen.putString(x+50, y+10, "p", Terminal.Color.WHITE, Terminal.Color.BLACK);
            }
            if(i==0 && w[i]!=null){
                int x = w[i].x;
                int y = w[i].y;
                screen.putString(x+50, y+10, "h", Terminal.Color.WHITE, Terminal.Color.BLACK);
            }

            if(b[i]!=null && i>0) {
                int x = b[i].x;
                int y = b[i].y;
                screen.putString(x+50, y+10, "p", Terminal.Color.RED, Terminal.Color.BLACK);
            }

            if(i==0 && b[i]!=null){
                int x= b[i].x;
                int y= b[i].y;
                screen.putString(x+50, y+10, "h", Terminal.Color.RED, Terminal.Color.BLACK);
            }
            }
        for (int i = 9; i <18; i++) {
            screen.putString(49, i, "|", Terminal.Color.GREEN, Terminal.Color.BLACK);
        }
        for (int i = 10; i <18; i++) {
            screen.putString(58, i, "|", Terminal.Color.GREEN, Terminal.Color.BLACK);
        }
        for (int i = 49; i <59; i++) {
            screen.putString(i, 9, "-", Terminal.Color.GREEN, Terminal.Color.BLACK);
        }
        for (int i = 49; i <59; i++) {
            screen.putString(i, 18, "-", Terminal.Color.GREEN, Terminal.Color.BLACK);
        }

        screen.refresh();
        Thread.sleep(500);
        }

        }



