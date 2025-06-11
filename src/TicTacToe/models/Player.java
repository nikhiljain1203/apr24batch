package TicTacToe.models;

public abstract class Player {
    private String name;
    private PlayerType playerType;
    private Symbol symbol;

    public Player() {
        this.name = "Default Player";
        this.playerType = PlayerType.HUMAN;
        this.symbol = null; // Symbol should be set later
    }

    public Player(String name, PlayerType playerType, Symbol symbol) {
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public abstract Move makeMove(Board board);
}
