package chackSpel;

import com.googlecode.lanterna.screen.Screen;

public class Game {
    Board gameboard = new Board();
    gameLogic logic= new gameLogic();
    Piece[] white = new Piece[3];
    Piece[] black = new Piece[3];
    LanternaScreen visual = new LanternaScreen();
    Player Lina = new Player(-1);
    Player Rikard = new Player(1);

    public void setUpBoard() throws InterruptedException { //Sets the pieces for the game
        Pawn pawn1 = new Pawn(1, 1, -1);
        gameboard.setPieceInPosition(pawn1, 1, 1);
        Pawn pawn2 = new Pawn(2, 1, -1);
        gameboard.setPieceInPosition(pawn2, 2, 1);
        Pawn pawn101 = new Pawn(1, 6, 1);
        gameboard.setPieceInPosition(pawn101, 1, 6);
        Pawn pawn102 = new Pawn(2, 6, 1);
        gameboard.setPieceInPosition(pawn102, 2, 6);
        Horse horse3 = new Horse(3,1,-1);
        gameboard.setPieceInPosition(horse3,3,1);
        Horse horse103 = new Horse(3,6,1);
        gameboard.setPieceInPosition(horse103,3,6);


        white[0] = pawn101;                     //Puts the pieces in arrays depending on player.
        white[1] = pawn102;
        white[2] = horse103;
        black[0] = pawn1;
        black[1] = pawn2;
        black[2] = horse3;
    }

    public boolean nextPlayer(int tur, Screen screen) throws InterruptedException {


        boolean gameOn = gameboard.gameOver(white, black);
        visual.printScreen(screen, white, black);


        if (gameOn) {
            if (tur == Lina.color) {
                gameboard.clear(gameboard.board, white, black);
                black = Lina.move(white, black, Lina.color);
                logic.uppdateBoard(black,white,gameboard);
            }
            else {

                gameboard.clear(gameboard.board, white, black);
                white = Rikard.move(white, black, Rikard.color);
                logic.uppdateBoard(white, black,gameboard);
                        }
        }
        else{
                return gameOn;
            }

            visual.printScreen(screen, white, black);
            System.out.println(gameboard.getPieceInPosition(1, 1));
            System.out.println(gameboard.getPieceInPosition(2, 1));


            return gameOn;
        }
    }

