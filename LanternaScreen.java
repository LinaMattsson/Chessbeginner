package chackSpel;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.Terminal;
import java.lang.Thread.State;

public class LanternaScreen {

    public LanternaScreen(){
        }

    public void printScreen(Screen screen, Piece[]w, Piece[]b) throws InterruptedException{
        screen.startScreen();
        screen.clear();
        for (int i = 0; i <3 ; i++) {
            if(w[i]!=null && i<2) {
                int x = w[i].x;
                int y = w[i].y;
                screen.putString(x, y, "p", Terminal.Color.WHITE, Terminal.Color.BLACK);
            }
            if(i==2 && w[i]!=null){
                int x = w[i].x;
                int y = w[i].y;
                screen.putString(x, y, "h", Terminal.Color.WHITE, Terminal.Color.BLACK);
            }

            if(b[i]!=null && i<2) {
                int x = b[i].x;
                int y = b[i].y;
                screen.putString(x, y, "p", Terminal.Color.RED, Terminal.Color.BLACK);
            }

            if(i==2 && b[i]!=null){
                int x= b[i].x;
                int y= b[i].y;
                screen.putString(x, y, "h", Terminal.Color.RED, Terminal.Color.BLACK);
            }
            }
        screen.refresh();
        Thread.sleep(500);
        }

        }



