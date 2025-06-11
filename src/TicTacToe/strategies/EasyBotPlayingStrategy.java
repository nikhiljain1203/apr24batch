package TicTacToe.strategies;

import TicTacToe.models.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move makeMove(Board board, Player player) {
        for(List<Cell> row: board.getGrid()) {
            for(Cell cell : row) {
                if(cell.getStatus().equals(CellStatus.EMPTY)) {
                    return new Move(cell, player);
                }
            }
        }
        return null;
    }
}
