package boardgame;

public class Piece {

		protected Position position;
		private Board board;
		
		public Piece(Board board) {
			this.board = board;
			position = null; // N�o precisaria colocar o valor null.
		}

		protected Board getBoard() {
			return board;
		}		
}