package none.chesspvp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.service.quicksettings.Tile;

import none.chesspvp.ChessPiece;

/**
 * Created by Jony on 24/07/2016.
 */
public class Queen extends ChessPiece {

	//constructor
	/*public  Queen(Context context, int color, none.chesspvp.Tile point){
		super(context, color, point);
	}*/

	//constructor
	public  Queen(Context context, int color, none.chesspvp.Tile tile){
		super(context, color, tile);
	}

	@Override
	protected boolean canMove() {
		return false;
	}

	@Override
	protected Tile[] canMoveTo(Tile originTile) {
		return new Tile[0];
	}

	@Override
	protected void move(Tile tile) {}

	@Override
	protected void onDraw(Canvas _canvas){

		Drawable d;
		if (_color == Color.BLACK)
		{
			d = getResources().getDrawable(R.mipmap.black_queen);
		}
		else
		{
			d = getResources().getDrawable(R.mipmap.white_queen);
		}
		if (d != null)
		{
			d.setBounds(this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
			d.draw(_canvas);
		}
	}
}
