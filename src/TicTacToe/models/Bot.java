package TicTacToe.models;

public class Bot extends Player {
    private BotDiffcultyLevel botDiffcultyLevel;

    public Bot(String playerName, BotDiffcultyLevel botDiffcultyLevel) {
        super(playerName, PlayerType.BOT, new Symbol('B'));
    }

    public BotDiffcultyLevel getBotDiffcultyLevel() {
        return botDiffcultyLevel;
    }

    public void setBotDiffcultyLevel(BotDiffcultyLevel botDiffcultyLevel) {
        this.botDiffcultyLevel = botDiffcultyLevel;
    }
}
