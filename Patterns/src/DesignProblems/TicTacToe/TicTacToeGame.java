package DesignProblems.TicTacToe;

import java.util.List;

class Piece {
  Symbol icon;
  Piece(Symbol icon) {
    this.icon = icon;
  }
}

class PieceX extends Piece {
  PieceX() {
    super(Symbol.X);
  }
}


class PieceO extends Piece {
  PieceO() {
    super(Symbol.O);
  }
}

enum Symbol {
  X, O;

}


class Player {
  String name;

  List<int[]> myMoves;

  Piece mySymbol;

  void addMove(int[] move) {myMoves.add(move);
  }
}

class PlayerX extends Player {

}

class PlayerO extends Player {

}

class Board {

  int size;
  Piece[][] boardState;

  Board( int size) {
    boardState = new Piece[size][size];
  }

  // add move
  // Player is the winner if valid
  void addMove(Player currPlayer, int row, int col) {

    // check for row, col validity

    // set current players symbol on the board
    boardState[row][col] = currPlayer.mySymbol;

    // add to player moves
    currPlayer.addMove(new int[]{row, col});


  }

}

class Game {
  Board currentBoard;
  List<Player> currentPlayers;

  void startGame() {

    int index = 0;

    // request input from player till game is not completed
    while(true) {

      int currentPlayerIndex = index % currentPlayers.size();

      // request for player move
      int inputRow = 0, inputCol = 0;

      // add to board
      currentBoard.addMove(currentPlayers.get(currentPlayerIndex), inputRow, inputCol);

      // check if game has been ended
      // check for curr row, curr col, curr diagonal, curr anti-diagonal

    }
  }

}
public class TicTacToeGame {



}
