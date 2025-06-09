package TicTacToe.models;

public class HumanPlayer extends Player {
    private int age;
    private int level;

    public HumanPlayer (String playerName, Symbol symbol, int age, int level) {
        super(playerName, PlayerType.HUMAN, symbol);
        this.age = age;
        this.level = level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
