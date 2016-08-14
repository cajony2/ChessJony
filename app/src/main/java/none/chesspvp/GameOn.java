package none.chesspvp;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameOn extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_on);
		Display display = getWindowManager().getDefaultDisplay();

		//                 //
		//all screen layout//
		//                 //
		RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);
		int mainHeight = mainLayout.getHeight();
		mainLayout.setBackgroundColor(Color.BLUE);

		//                  //
		//upper board layout//
		//                  //
		RelativeLayout boardLayout = (RelativeLayout) findViewById(R.id.boardLayout);
		int widthOfScreen = display.getWidth();//width of the screen
		RelativeLayout.LayoutParams upperLayoutParams = (RelativeLayout.LayoutParams) boardLayout.getLayoutParams();
		upperLayoutParams.width = widthOfScreen;
		upperLayoutParams.height = widthOfScreen;//height = width(squared layout for the board)
		GridView grid = (GridView) findViewById(R.id.chessboard);//gridView for the board
		ChessBoard chessBoard = new ChessBoard(this);//initializing the board
		grid.setAdapter(chessBoard);

		//                    //
		//lower buttons layout//
		//                    //
		RelativeLayout bottomLayout = (RelativeLayout) findViewById(R.id.bottomLayout);
		int height = mainHeight - upperLayoutParams.height;//suppose to fill the bottom screen under the board
		RelativeLayout.LayoutParams bottomParams = (RelativeLayout.LayoutParams) bottomLayout.getLayoutParams();
		bottomParams.height = height;
		bottomLayout.setBackgroundColor(Color.RED);
	}
}
