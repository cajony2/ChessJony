package none.chesspvp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;

/**
 * Created by Jony on 23/07/2016.
 */
public abstract class Board extends BaseAdapter{

	protected Tile[][] tiles;
	protected ArrayList<Tile> _tiles;
	protected Context _context;



}
