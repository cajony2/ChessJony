package none.chesspvp;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/**
 * Created by Jony on 23/07/2016.
 */
public class ChessBoard extends Board { //Board is a baseAdapter

	private final int TILES_NUMBER_IN_A_ROW = 8;
	//private int[] whiteTilesPosition = new int[] {0,2,4,6,9,11,13,15,16,18,20,22,25,27,29,31,32,34,36,38,41,43,45,47,48,50,52,54,57,59,61,63};
	public Player _player;

	//constructor
	public ChessBoard(Context context) {
		_context = context;
		//_tiles = new ArrayList<Tile>();
		tiles = new Tile[TILES_NUMBER_IN_A_ROW][TILES_NUMBER_IN_A_ROW];
		_player = new Player.WhitePlayer("Jony");

		//////setting a chess board (white player view)//////
		for (int i = 0; i < TILES_NUMBER_IN_A_ROW; i++){
			int colorDivider = 0;
			for (int j = 0; j < TILES_NUMBER_IN_A_ROW; j++){
				if ((i % 2) == 0){
					if ((colorDivider % 2) == 0){
						//_tiles.add(new Tile.WhiteTile(context, new Point(i, j)));
						tiles[i][j] = new Tile.WhiteTile(context, new Point(i, j));
					}
					else{
						//_tiles.add(new Tile.BlackTile(context, new Point(i, j)));
						tiles[i][j] = new Tile.BlackTile(context, new Point(i, j));
					}
				}
				else{
					if ((colorDivider % 2) == 0){
						//_tiles.add(new Tile.BlackTile(context, new Point(i, j)));
						tiles[i][j] = new Tile.BlackTile(context, new Point(i, j));
					}
					else{
						//_tiles.add(new Tile.WhiteTile(context, new Point(i, j)));
						tiles[i][j] = new Tile.WhiteTile(context, new Point(i, j));
					}
				}
				colorDivider++;
			}
		}
		//was trying to set the black player board
		/*for (int i = 0; i < TILES_NUMBER_IN_A_ROW; i++){
			int colorDivider = 0;
			for (int j = 0; j < TILES_NUMBER_IN_A_ROW; j++){
				if ((i % 2) == 0){
					if ((colorDivider % 2) == 0){
						_tiles.add(new Tile.WhiteTile(context, new Point(7-i, 7-j)));
					}
					else{
						_tiles.add(new Tile.BlackTile(context, new Point(7-i, 7-j)));
					}
				}
				else{
					if ((colorDivider % 2) == 0){
						_tiles.add(new Tile.BlackTile(context, new Point(7-i, 7-j)));
					}
					else{
						_tiles.add(new Tile.WhiteTile(context, new Point(7-i, 7-j)));
					}
				}
				colorDivider++;
			}
		}*/
		setWhiteBoardPieces();
	}

	//setting the board from the white player point of view
	private void setWhiteBoardPieces() {
		//filling first row from the top with black chess pieces
		/*_tiles.get(0).setPiece(new Rook(_context, Color.BLACK, _tiles.get(0)._position));
		_tiles.get(1).setPiece(new Knight(_context, Color.BLACK, _tiles.get(1)._position));
		_tiles.get(2).setPiece(new Bishop(_context, Color.BLACK, _tiles.get(2)._position));
		_tiles.get(3).setPiece(new Queen(_context, Color.BLACK, _tiles.get(3)._position));
		_tiles.get(4).setPiece(new King(_context, Color.BLACK, _tiles.get(4)._position));
		_tiles.get(5).setPiece(new Bishop(_context, Color.BLACK, _tiles.get(5)._position));
		_tiles.get(6).setPiece(new Knight(_context, Color.BLACK, _tiles.get(6)._position));
		_tiles.get(7).setPiece(new Rook(_context, Color.BLACK, _tiles.get(7)._position));*/

		tiles[0][0].setPiece(new Rook(_context, Color.BLACK, tiles[0][0]));
		tiles[0][1].setPiece(new Knight(_context, Color.BLACK, tiles[0][0]));
		tiles[0][2].setPiece(new Bishop(_context, Color.BLACK, tiles[0][0]));
		tiles[0][3].setPiece(new Queen(_context, Color.BLACK, tiles[0][0]));
		tiles[0][4].setPiece(new King(_context, Color.BLACK, tiles[0][0]));
		tiles[0][5].setPiece(new Bishop(_context, Color.BLACK, tiles[0][0]));
		tiles[0][6].setPiece(new Knight(_context, Color.BLACK, tiles[0][0]));
		tiles[0][7].setPiece(new Rook(_context, Color.BLACK, tiles[0][0]));



		//filling second row from the top with black pawns
		for (int i = 0; i < TILES_NUMBER_IN_A_ROW; i++)
		{
//			_tiles.get(i + 8).setPiece(new Pawn(_context, Color.BLACK, _tiles.get(i + 8)._position));
			tiles[1][i].setPiece(new Pawn(_context, Color.BLACK, tiles[1][i]));
		}


		//filling second row from the bottom with white pawns
		for (int i = 0; i < TILES_NUMBER_IN_A_ROW; i++)
		{
//			_tiles.get(i + 48).setPiece(new Pawn(_context, Color.WHITE, _tiles.get(i + 48)._position));
			tiles[6][i].setPiece(new Pawn(_context, Color.WHITE, tiles[6][i]));
		}

		//filling first row from the bottom with white chess pieces
		/*_tiles.get(56).setPiece(new Rook(_context, Color.WHITE, _tiles.get(56)._position));
		_tiles.get(57).setPiece(new Knight(_context, Color.WHITE, _tiles.get(57)._position));
		_tiles.get(58).setPiece(new Bishop(_context, Color.WHITE, _tiles.get(58)._position));
		_tiles.get(59).setPiece(new Queen(_context, Color.WHITE, _tiles.get(59)._position));
		_tiles.get(60).setPiece(new King(_context, Color.WHITE, _tiles.get(60)._position));
		_tiles.get(61).setPiece(new Bishop(_context, Color.WHITE, _tiles.get(61)._position));
		_tiles.get(62).setPiece(new Knight(_context, Color.WHITE, _tiles.get(62)._position));
		_tiles.get(63).setPiece(new Rook(_context, Color.WHITE, _tiles.get(63)._position));*/

		tiles[7][0].setPiece(new Rook(_context, Color.WHITE, tiles[7][0]));
		tiles[7][1].setPiece(new Knight(_context, Color.WHITE, tiles[7][1]));
		tiles[7][2].setPiece(new Bishop(_context, Color.WHITE, tiles[7][2]));
		tiles[7][3].setPiece(new Queen(_context, Color.WHITE, tiles[7][3]));
		tiles[7][4].setPiece(new King(_context, Color.WHITE, tiles[7][4]));
		tiles[7][5].setPiece(new Bishop(_context, Color.WHITE, tiles[7][5]));
		tiles[7][6].setPiece(new Knight(_context, Color.WHITE, tiles[7][6]));
		tiles[7][7].setPiece(new Rook(_context, Color.WHITE, tiles[7][7]));

	}

	/*private void setBlackBoardPieces() {
		//filling first row from the top with black chess pieces
		_tiles.get(0).setPiece(new Rook(_context, Color.WHITE, _tiles.get(64-0)._position));
		_tiles.get(1).setPiece(new Knight(_context, Color.WHITE, _tiles.get(64-1)._position));
		_tiles.get(2).setPiece(new Bishop(_context, Color.WHITE, _tiles.get(64-2)._position));
		_tiles.get(3).setPiece(new Queen(_context, Color.WHITE, _tiles.get(64-3)._position));
		_tiles.get(4).setPiece(new King(_context, Color.WHITE, _tiles.get(64-4)._position));
		_tiles.get(5).setPiece(new Bishop(_context, Color.WHITE, _tiles.get(64-5)._position));
		_tiles.get(6).setPiece(new Knight(_context, Color.WHITE, _tiles.get(64-6)._position));
		_tiles.get(7).setPiece(new Rook(_context, Color.WHITE, _tiles.get(64-7)._position));

		//filling second row from the top with black pawns
		for (int i = 0; i < TILES_NUMBER_IN_A_ROW; i++)
		{
			_tiles.get(i + 8).setPiece(new Pawn(_context, Color.WHITE, _tiles.get(64-(i + 8))._position));
		}

		//filling second row from the bottom with white pawns
		for (int i = 0; i < TILES_NUMBER_IN_A_ROW; i++)
		{
			_tiles.get(i + 48).setPiece(new Pawn(_context, Color.BLACK, _tiles.get(64-(i + 48))._position));
		}

		//filling first row from the bottom with white chess pieces
		_tiles.get(56).setPiece(new Rook(_context, Color.BLACK, _tiles.get(64-56)._position));
		_tiles.get(57).setPiece(new Knight(_context, Color.BLACK, _tiles.get(64-57)._position));
		_tiles.get(58).setPiece(new Bishop(_context, Color.BLACK, _tiles.get(64-58)._position));
		_tiles.get(59).setPiece(new Queen(_context, Color.BLACK, _tiles.get(64-59)._position));
		_tiles.get(60).setPiece(new King(_context, Color.BLACK, _tiles.get(64-60)._position));
		_tiles.get(61).setPiece(new Bishop(_context, Color.BLACK, _tiles.get(64-61)._position));
		_tiles.get(62).setPiece(new Knight(_context, Color.BLACK, _tiles.get(64-62)._position));
		_tiles.get(63).setPiece(new Rook(_context, Color.BLACK, _tiles.get(64-63)._position));
	}//not working yet*/

	@Override
	public int getCount() {
		return 64;
	}

	@Override
	public Object getItem(int position) {

		return tileFromPosition(position);

		//return _tiles.get(position);
	}

	@Override
	public long getItemId(int position) {//has no use
		return tiles[0][0].getDrawingTime();
	}

	@Override //my old getView
	public View getView(int position, View convertView, ViewGroup parent) {

		Tile tile;
		if (convertView == null) {
			//tile = _tiles.get(position);
			tile = tileFromPosition(position);
			tile.setPadding(0,0,0,0);
			tile.setMinimumHeight(parent.getHeight()/TILES_NUMBER_IN_A_ROW);
		}
		else {
			tile = (Tile) convertView;
		}
		tile.setId(position);
		ChessPiece cp = tile.getPiece();
		if (cp != null)//check which piece is set on the tile and displays it
		{
			//might be less expensive not to create new object in every call, but to reuse objects
			if (cp instanceof Bishop) {
				tile.addView(new Bishop(_context, ((Bishop) cp)._color, tile));
			} else if (cp instanceof Rook) {
				tile.addView(new Rook(_context, ((Rook) cp)._color, tile));
			} else if (cp instanceof Knight) {
				tile.addView(new Knight(_context, ((Knight) cp)._color, tile));
			} else if (cp instanceof Queen) {
				tile.addView(new Queen(_context, ((Queen) cp)._color, tile));
			} else if (cp instanceof King) {
				tile.addView(new King(_context, ((King) cp)._color, tile));
			} else if (cp instanceof Pawn) {
				tile.addView(new Pawn(_context, ((Pawn) cp)._color, tile));
			}
		}
		return tile;
	}

	private Tile tileFromPosition(int position)
	{
		int counter = 0;
		if (_player instanceof Player.WhitePlayer)
		{
			for (int i = 0; i < TILES_NUMBER_IN_A_ROW; i++) {
				for (int j = 0; j < TILES_NUMBER_IN_A_ROW; j++) {
					if (counter == position)
					{
						return tiles[i][j];
					}
					counter++;
				}
			}
		}
		else
		{
			for (int i = TILES_NUMBER_IN_A_ROW; i > 0; i--) {
				for (int j = TILES_NUMBER_IN_A_ROW; j > 0; j--) {
					if (counter == position)
					{
						return tiles[i][j];
					}
					counter++;
				}
			}
		}
		return null;
	}

	//returns the position of a tile (Point object) from its position in the _tiles array
	private Point positionToPoint(int position)
	{
		switch (position)
		{
			case 1: return new Point(0,0);
			case 2: return new Point(0,1);
			case 3: return new Point(0,2);
			case 4: return new Point(0,3);
			case 5: return new Point(0,4);
			case 6: return new Point(0,5);
			case 7: return new Point(0,6);
			case 8: return new Point(0,7);
			case 9: return new Point(1,0);
			case 10: return new Point(1,1);
			case 11: return new Point(1,2);
			case 12: return new Point(1,3);
			case 13: return new Point(1,4);
			case 14: return new Point(1,5);
			case 15: return new Point(1,6);
			case 16: return new Point(1,7);
			case 17: return new Point(2,0);
			case 18: return new Point(2,1);
			case 19: return new Point(2,2);
			case 20: return new Point(2,3);
			case 21: return new Point(2,4);
			case 22: return new Point(2,5);
			case 23: return new Point(2,6);
			case 24: return new Point(2,7);
			case 25: return new Point(3,0);
			case 26: return new Point(3,1);
			case 27: return new Point(3,2);
			case 28: return new Point(3,3);
			case 29: return new Point(3,4);
			case 30: return new Point(3,5);
			case 31: return new Point(3,6);
			case 32: return new Point(3,7);
			case 33: return new Point(4,0);
			case 34: return new Point(4,1);
			case 35: return new Point(4,2);
			case 36: return new Point(4,3);
			case 37: return new Point(4,4);
			case 38: return new Point(4,5);
			case 39: return new Point(4,6);
			case 40: return new Point(4,7);
			case 41: return new Point(5,0);
			case 42: return new Point(5,1);
			case 43: return new Point(5,2);
			case 44: return new Point(5,3);
			case 45: return new Point(5,4);
			case 46: return new Point(5,5);
			case 47: return new Point(5,6);
			case 48: return new Point(5,7);
			case 49: return new Point(6,0);
			case 50: return new Point(6,1);
			case 51: return new Point(6,2);
			case 52: return new Point(6,3);
			case 53: return new Point(6,4);
			case 54: return new Point(6,5);
			case 55: return new Point(6,6);
			case 56: return new Point(6,7);
			case 57: return new Point(7,0);
			case 58: return new Point(7,1);
			case 59: return new Point(7,2);
			case 60: return new Point(7,3);
			case 61: return new Point(7,4);
			case 62: return new Point(7,5);
			case 63: return new Point(7,6);
			case 64: return new Point(7,7);
		}
		return null;
	}

}
