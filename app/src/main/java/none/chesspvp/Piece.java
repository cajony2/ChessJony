package none.chesspvp;
import android.content.Context;
import android.graphics.Color;
import android.view.View;

/**
 * Created by Jony on 23/07/2016.
 */
public abstract class Piece extends View{

	protected int _color;

	//constructor
	public Piece(Context context) {
		super(context);
	}
}

