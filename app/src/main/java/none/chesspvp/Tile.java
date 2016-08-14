package none.chesspvp;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Jony on 24/07/2016.
 */
public abstract class Tile extends FrameLayout {

	protected final Point _position;
	protected int _color;
	protected ChessPiece _piece;

	//constructor
	public Tile(Context context, Point position) {
		super(context);
		_position = position;
		setClickable(true);
	}

	public Point getPosition(){
		return _position;
	}

	public ChessPiece getPiece(){
		return _piece;
	}

	public int getColor(){
		return _color;
	}

	public void setPiece(ChessPiece piece){
		_piece = piece;
		addView(_piece);
	}

	//inner class that represents a white tile
	public static final class WhiteTile extends Tile{
		//white tile constructor
		public WhiteTile(Context context, Point position) {
			super(context, position);
			_color = Color.WHITE;
			this.setBackgroundResource(R.drawable.white_tile);
		}
	}

	//inner class that represents a black tile
	public static final class BlackTile extends Tile{
		//black tile constructor
		public BlackTile(Context context, Point position){
			super(context, position);
			_color = Color.BLACK;
			this.setBackgroundResource(R.drawable.black_wooden_tile);

		}
	}
}
