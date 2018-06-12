package cn.edu.zju.id21732134.lihaoliang18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import java.util.Arrays;
import android.os.Bundle;

import cn.iipc.android.tweetlib.SubmitProgram;

public class CalculatorActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private GridLayout mGridLayout;
    private int columnCount; //列数
    private int screenWidth; //屏幕宽度



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        mGridLayout = (GridLayout) findViewById(R.id.gridLayout);
        columnCount = mGridLayout.getColumnCount();
        screenWidth = this.getWindowManager().getDefaultDisplay().getWidth();
        Log.e(TAG, "column:" + columnCount + ";  screenwidth:" + screenWidth);
        for (int i = 0; i < mGridLayout.getChildCount(); i++) {
            Button button = (Button) mGridLayout.getChildAt(i);
            button.setWidth(screenWidth / columnCount);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello, menu);
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
            new SubmitProgram().doSubmit(this,"C1");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
