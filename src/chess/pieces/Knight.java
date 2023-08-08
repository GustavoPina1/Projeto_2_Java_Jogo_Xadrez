package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "N";
	}

	public boolean[][] possibleMoves() {
		;
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);
		
		
		p.setValue(position.getRow() - 1, position.getColumn()-2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValue(position.getRow() -2, position.getColumn()-1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

	
		p.setValue(position.getRow()-2, position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}


		p.setValue(position.getRow()-1, position.getColumn() + 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		p.setValue(position.getRow() + 1, position.getColumn() +2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// nordeste
		p.setValue(position.getRow() +2, position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// sudoeste
		p.setValue(position.getRow() + 2, position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// sudeste
		p.setValue(position.getRow() + 1, position.getColumn() - 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}

	private boolean canMove(Position positon) {
		ChessPiece p = (ChessPiece) getBoard().piece(positon);
		return p == null || p.getColor() != getColor();
	}

}
