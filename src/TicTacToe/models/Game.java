package TicTacToe.models;

import TicTacToe.strategies.WinningStrategy;

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
        this.winningStrategies = new ArrayList<>();
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

    public void display() {
        board.display();
    }

    public void makeMove() {
        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.println("It is " + currentPlayer.getName() + "'s turn");

        Move move = currentPlayer.makeMove(board);

        if(!vaildate(move)) {
            System.out.println("Invalid move. Try again.");
            return;
        }

        updateGame(move, currentPlayer);

        if(checkWinner(move)) {
            winner = currentPlayer;
            setStatus(GameStatus.SUCCESS);
        } else if (checkDraw()) {
            setStatus(GameStatus.DRAW);
        }
    }

    private boolean vaildate(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()) {
            return false;
        }

        return move.getCell().getStatus().equals(CellStatus.EMPTY);
    }

    private void updateGame(Move move, Player currentPlayer) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToChange = board.getGrid().get(row).get(col);
        cellToChange.setStatus(CellStatus.OCCUPIED);
        cellToChange.setPlayer(currentPlayer);

        move.setCell(cellToChange);
        move.setPlayer(currentPlayer);
        moves.add(move);
    }

    public boolean checkWinner(Move move) {
        for(WinningStrategy winningStrategy : winningStrategies) {
            if(winningStrategy.checkWinner(this.board, move)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDraw() {
        return moves.size() == board.getSize() * board.getSize();
    }
}
