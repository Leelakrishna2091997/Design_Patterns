package DesignProblems.TicTacToe;

import java.util.Stack;

public class TicTacToeV2 {

  Player pf = SelectFactory.getFactory("").createPlayer("");

  class SelectFactory {
    static PlayerFactory getFactory(String type) {
        return null;
    }
  }
  interface Player {

    // adds a new move to his list of moves
    // void addMove(int row, int col);
    void display();
  }


  class AIPlayer implements Player {

    public void display() {
      // am an AI player
    }
  }

  class HumanPlayer implements Player {
    public void display() {
      // am a human player
    }
  }

  interface PlayerFactory {

    Player createPlayer(String type);
  }

  class AIPlayerFactory implements PlayerFactory {
    public Player createPlayer(String type) {
      // according to the type of input given AI players of different models are created
      return null;
    }
  }


  class HumanPlayerFactory implements PlayerFactory {
    public Player createPlayer(String type) {
      // according to the type of input given, human players with different intelligence created
      return null;
    }
  }


  interface GameState {
    void placeMove(int r, int c, Player p);
    void removeMove(int r, int c);
  }

  interface Command {

    void execute(GameState gs);
    void undo(GameState gs);
  }

  class Board implements GameState{
    public void placeMove(int r, int c, Player p) {

    }
    public void removeMove(int r, int c) {

    }

  }

  class MoveCommand implements Command {

    int r, c;
    Player p;

    public void execute(GameState gs) {
      gs.placeMove(r,c,p);
    }

    public void undo(GameState gs) {
      gs.removeMove(r,c);
    }
  }



  // Singleton GameController
  class GameController {

    private static GameController game;
    Stack<Command> moveHistory;
    Stack<Command> redoMoves;

    public void playTurn() {
      // create a move command
      // push to move history
      // execute the move command by passing board
    }

    public void undo() {
      // if history available
      {
        // take the last move from history
        // run undo of the popped move
        // push to redostack
      }

    }
    public void redo() {
      // if redo stack available
      {
        // take the last move from redo stack
        // run execute of the popped move
        // push to movehistory
      }

    }

    private GameController() {

    }

    public GameController getInstance() {

        // check if doesn't exists
        if(game == null ) {
          game = new GameController();
        }

        // exists
        return game;

    }


  }
}
