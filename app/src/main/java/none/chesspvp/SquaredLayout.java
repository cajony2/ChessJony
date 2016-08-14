package none.chesspvp;

import android.content.Context;
import android.widget.RelativeLayout;

/**
 * Created by Jony on 13/08/2016.
 */
public class SquaredLayout extends RelativeLayout{
	public SquaredLayout(Context context) {
		super(context);
	}


	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int width = MeasureSpec.getSize(widthMeasureSpec);
		int height = MeasureSpec.getSize(heightMeasureSpec);
		if(width > height) {
			super.onMeasure(heightMeasureSpec, heightMeasureSpec);
		} else {
			super.onMeasure(widthMeasureSpec, widthMeasureSpec);
		}
	}
}
