package none.chesspvp;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.service.quicksettings.Tile;


/**
 * Created by Jony on 24/07/2016.
 */
public class Bishop extends ChessPiece {   //extends View

	//constructor
	public  Bishop(Context context, int color, Point position){
		super(context, color, position);
	}

	public  Bishop(Context context, int color){
		super(context, color);
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
			d = getResources().getDrawable(R.mipmap.black_bishop);
		}
		else
		{
			d = getResources().getDrawable(R.mipmap.white_bishop);
		}
		if (d != null)
		{
			d.setBounds(this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
			d.draw(_canvas);
		}
	}
}
