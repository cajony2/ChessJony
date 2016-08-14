package none.chesspvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class ChessGame extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chess_game);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
						.setAction("Action", null).show();
			}
		});

		Button loginBtn = (Button)findViewById(R.id.button);
		loginBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
//				final TextView mTextView = (TextView) findViewById(R.id.button);
//				mTextView.setText("Some Text");
				startActivity(new Intent(ChessGame.this, GameOn.class));
			}
		});

		/*Button clickButton = (Button) findViewById(R.id.button2);
		clickButton.setOnClickListener( new View.OnClickListener() {

			@Override
			public void onClick(View v) {
//				private void connectButton(){
				new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							URL url = new URL("http://79.182.61.212:8080/Chess/ChessServlet");
							URLConnection connection = null;
							try {
								connection = url.openConnection();
							} catch (IOException e) {
								e.printStackTrace();
							}

							String message = "connect message from android";

							String inputString = "jony";
							String password = "catan";

							connection.setRequestProperty("Action", "LogIn");
							connection.setRequestProperty("UserName", inputString);
							connection.setRequestProperty("Password", password);

							Log.d("Button clicked", "connect");

							connection.setDoOutput(true);
							OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
							out.write(message);
							out.close();

							BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
							String returnString = "";
							String json = "";
							while ((returnString = in.readLine()) != null) {
								json += returnString;
							}

							Log.d("response", json + "");

							try {
								JSONArray players = new JSONArray(json);
							} catch (JSONException e) {
								e.printStackTrace();
							}

							in.close();

						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}).start();

//			}

			}
		});*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_chess_game, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
