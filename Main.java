package chackSpel;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.Terminal;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Screen screen = TerminalFacade.createScreen();
        Terminal terminal = TerminalFacade.createTerminal();

        Game g = new Game();
        g.setUpBoard();
        Boolean run = true;
        int tur = 1;
        while (run) {

            run = g.nextPlayer(tur, screen);
            /*for (int k = 0; k < 8; k++) {
                for (int l = 0; l < 8; l++) {
                    System.out.println(g.gameboard.getPieceInPosition(k, l));

                }
            }*/
                tur = tur * -1;
            }
            System.out.println("GameOver");
            /*for (int k = 0; k < 8; k++) {
                for (int l = 0; l < 8; l++) {
                    System.out.println(g.gameboard.getPieceInPosition(k, l));

                }
            }*/
        }
    }

