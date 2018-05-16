/*
Laura Davis CIS 262-902
31 January 2018
This app uses a counter to increment taps of a button
that will be displayed on screen as they are accumulated.
 */
package com.missouristate.davis916.tapbuttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //create a model
    private Counter count;

    //create a view
    private TextView countView;

    //creates the Counter object
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        count = new Counter();
        countView = (TextView) findViewById(R.id.textView);

    }//end onCreate

    //sends the tap to the incrementer method.
    // Returns incremented count to be displayed on screen.
    public void countTap(View view){
        count.addCount();
        countView.setText(count.getCount().toString());
    }//end countTap

    //calls the reset() method so the count is set back
    //to zero when the RESET button is pressed
    public void countReset(View view){
        count.reset();
        countView.setText(count.getCount().toString());
    }//end countReset

    //Settings menu. menu_main.xml must be created and configured
    //properly for this to work
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //inflate the menu
        //this adds items to the action bar if present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }//end onCreateOptionsMenu

    //ties the menu item to action_settings string
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        /* Handle action bar item clicks here. The action bar
        * will automatically handle clicks on the Home/Up button
        * as long as a parent activity is specified in AndroidManifest.xml
        */
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }//end onOptionsItemSelected

}//end MainActivity
