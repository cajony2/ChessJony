package none.chesspvp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.service.quicksettings.Tile;

/**
 * Created by Jony on 23/07/2016.
 */
public abstract class ChessPiece extends Piece{ //extends View

	protected boolean _isActive;
	protected none.chesspvp.Tile _tile;//or should it be a Point object to hold position?
	protected Point _position;

	//constructor
	public ChessPiece(Context context, int color, Point position){
		super(context);
		_color = color;
		_position = position;
		_isActive = true;
		setWillNotDraw(false);
	}

	//constructor
	public ChessPiece(Context context, int color, none.chesspvp.Tile tile){
		super(context);
		_color = color;
		_tile = tile;
		_isActive = true;
	}

	//constructor
	public ChessPiece(Context context, int color) {
		super(context);
		_color = color;
		_isActive = true;
	}

	//king can`t move to risky tiles, and other pieces can`t move if the king is exposed
	protected abstract boolean canMove();

	protected void eliminated(){
		_isActive = false;
		_tile.setPiece(null);

	}

	protected abstract Tile[] canMoveTo(Tile originTile);

	protected abstract void move(Tile tile);

}
