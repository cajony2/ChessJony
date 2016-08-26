package none.chesspvp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;

import none.chesspvp.ChessPiece;

/**
 * Created by Jony on 24/07/2016.
 */
public class Player {

	private static int _color;
	private String _name;
	private ChessPiece[] _pieces;

	public Player(String name){
		_name = name;
	}



	public static final class WhitePlayer extends Player{
		//white player constructor
		public WhitePlayer(String name) {
			super(name);
			_color = Color.WHITE;
		}
	}
}
