package chessGame;

import com.googlecode.lanterna.screen.Screen;

public class Game {
    Board gameboard = new Board();
    gameLogic logic= new gameLogic();
    Piece[] white = new Piece[9];
    Piece[] black = new Piece[9];
    LanternaScreen visual = new LanternaScreen();
    Player Lina = new Player(-1);
    Player Rikard = new Player(1);

    public void setUpBoard() throws InterruptedException { //Sets the pieces for the game
        Pawn pawn1 = new Pawn(0, 1, -1);
        gameboard.setPieceInPosition(pawn1, 1, 1);
        Pawn pawn2 = new Pawn(1, 1, -1);
        gameboard.setPieceInPosition(pawn2, 2, 1);
        Pawn pawn3 = new Pawn(2, 1, -1);
        gameboard.setPieceInPosition(pawn3, 1, 1);
        Pawn pawn4 = new Pawn(3, 1, -1);
        gameboard.setPieceInPosition(pawn4, 1, 1);
        Pawn pawn5 = new Pawn(4, 1, -1);
        gameboard.setPieceInPosition(pawn5, 1, 1);
        Pawn pawn6 = new Pawn(5, 1, -1);
        gameboard.setPieceInPosition(pawn6, 1, 1);
        Pawn pawn7 = new Pawn(6, 1, -1);
        gameboard.setPieceInPosition(pawn7, 1, 1);
        Pawn pawn8 = new Pawn(7, 1, -1);
        gameboard.setPieceInPosition(pawn8, 1, 1);
        Horse horse0 = new Horse(3,0,-1);
        gameboard.setPieceInPosition(horse0,3,1);

        Pawn pawn101 = new Pawn(0, 6, 1);
        gameboard.setPieceInPosition(pawn101, 1, 6);
        Pawn pawn102 = new Pawn(1, 6, 1);
        gameboard.setPieceInPosition(pawn102, 2, 6);
        Pawn pawn103 = new Pawn(2, 6, 1);
        gameboard.setPieceInPosition(pawn103, 2, 6);
        Pawn pawn104 = new Pawn(3, 6, 1);
        gameboard.setPieceInPosition(pawn104, 2, 6);
        Pawn pawn105 = new Pawn(4, 6, 1);
        gameboard.setPieceInPosition(pawn105, 2, 6);
        Pawn pawn106 = new Pawn(5, 6, 1);
        gameboard.setPieceInPosition(pawn106, 2, 6);
        Pawn pawn107 = new Pawn(6, 6, 1);
        gameboard.setPieceInPosition(pawn107, 2, 6);
        Pawn pawn108 = new Pawn(7, 6, 1);
        gameboard.setPieceInPosition(pawn108, 2, 6);
        Horse horse100 = new Horse(3,7,1);
        gameboard.setPieceInPosition(horse100,3,6);


                             //Puts the pieces in arrays depending on player.
        white[8] = pawn108;                     //Puts the pieces in arrays depending on player.
        white[7] = pawn107;                     //Puts the pieces in arrays depending on player.
        white[6] = pawn106;                     //Puts the pieces in arrays depending on player.
        white[5] = pawn105;                     //Puts the pieces in arrays depending on player.
        white[4] = pawn104;                     //Puts the pieces in arrays depending on player.
        white[3] = pawn103;                     //Puts the pieces in arrays depending on player.
        white[2] = pawn102;                     //Puts the pieces in arrays depending on player.
        white[1] = pawn101;
        white[0] = horse100;
        black[8] = pawn8;
        black[7] = pawn7;
        black[6] = pawn6;
        black[5] = pawn5;
        black[4] = pawn4;
        black[3] = pawn3;
        black[2] = pawn2;
        black[1] = pawn1;
        black[0] = horse0;
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

            return gameOn;
        }
    }

