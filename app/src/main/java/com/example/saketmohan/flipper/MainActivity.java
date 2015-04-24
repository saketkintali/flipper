package com.example.saketmohan.flipper;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.Activity;
import android.widget.Button;
import android.widget.*;


public class MainActivity extends Activity implements View.OnClickListener{



    Button btn;
    ViewFlipper flip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flipview);
        btn = (Button)findViewById(R.id.clickbtn);
        btn.setOnClickListener(this);
        flip = (ViewFlipper)findViewById(R.id.flipper);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public void onClick(View v) {
        flip.showNext();
    }
}
