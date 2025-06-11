package TicTacToe.models;

import TicTacToe.strategies.BotPlayingStrategy;
import TicTacToe.strategies.BotPlayingStrategyFactory;

public class Bot extends Player {
    private BotDiffcultyLevel botDiffcultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String playerName, BotDiffcultyLevel botDiffcultyLevel) {
        super(playerName, PlayerType.BOT, new Symbol('B'));
        this.botDiffcultyLevel = botDiffcultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getStrategy(botDiffcultyLevel);
    }

    public BotDiffcultyLevel getBotDiffcultyLevel() {
        return botDiffcultyLevel;
    }

    public void setBotDiffcultyLevel(BotDiffcultyLevel botDiffcultyLevel) {
        this.botDiffcultyLevel = botDiffcultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
        return botPlayingStrategy.makeMove(board, this);
    }
}
