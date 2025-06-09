package TicTacToe;

import TicTacToe.controller.GameController;
import TicTacToe.models.*;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        Player p1 = new HumanPlayer("Nikhil", new Symbol('X'), 30, 1);
        Player p2 = new Bot("Bot", BotDiffcultyLevel.EASY);

        Game game = gameController.startGame(
                3,
                List.of(p1, p2),
                null
        );

        gameController.display(game);

        while (gameController.getGameStatus(game) == GameStatus.IN_PROGRESS) {
            gameController.makeMove(game);
            gameController.display(game);
        }

        if(gameController.getGameStatus(game) == GameStatus.SUCCESS) {
            System.out.println("Winner: " + gameController.getWinner(game));
        } else if(gameController.getGameStatus(game) == GameStatus.DRAW) {
            System.out.println("Game is a Draw");
        }
    }
}

// Client (HardCoded) -> GameController

// Steps
// Step 1: Code the models
// Step 2: Code the controller
// Step 3: Code the client
// Step 4: Start building functionality

// HW1: Please execute controller to be a singleton
// HW2: Please execute builder in Game
// HW3: Think and Implement MakeMove functionality
