package TicTacToe.strategies;

import TicTacToe.models.BotDiffcultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategy(BotDiffcultyLevel botDiffcultyLevel) {
        if(botDiffcultyLevel.equals(BotDiffcultyLevel.EASY)) {
            return new EasyBotPlayingStrategy();
        }
        return null;
    }
}
