package TicTacToe.models;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private int age;
    private int level;

    private Scanner scanner;

    public HumanPlayer (String playerName, Symbol symbol, int age, int level) {
        super(playerName, PlayerType.HUMAN, symbol);
        this.age = age;
        this.level = level;
        this.scanner = new Scanner(System.in);
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

    public Move makeMove(Board board) {
        System.out.println("Enter row for the move");
        int row = scanner.nextInt();
        System.out.println("Enter column for the move");
        int column = scanner.nextInt();

        return new Move(new Cell(row, column), this);
    }
}
