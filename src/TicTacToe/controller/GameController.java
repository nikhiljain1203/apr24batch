package TicTacToe.controller;

import TicTacToe.models.Game;
import TicTacToe.models.GameStatus;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
    // startGame
    public Game startGame(int size,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies) {
        return new Game(size, players, winningStrategies);
    }
    // makeMove
    public void makeMove(Game game) {
        game.makeMove();
    }
    // getGameStatus
    public GameStatus getGameStatus(Game game) {
        return game.getStatus();
    }
    // display
    public void display(Game game) {
        game.display();
    }

    public String getWinner(Game game) {
        return game.getWinner().getName();
    }
    // undoMove
    public void undoMove(Game game) {
        game.undoMove();
    }
}
