package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private int nextPlayerIndex;
    private Player winner;
    private List<Move> moves;
    private GameStatus status;
    private List<WinningStrategy> winningStrategies;

    public Game() {
        this.board = null;
        this.players = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.winner = null;
        this.moves = new ArrayList<>();
        this.status = GameStatus.NOT_STARTED;
        this.winningStrategies = new ArrayList<>();
    }

    public Game (int size,
                 List<Player> players,
                 List<WinningStrategy> winningStrategies) {
        this();
        this.board = new Board(size);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.status = GameStatus.IN_PROGRESS;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
