package com.ctrl.asciicodeconverter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void convertToAscii(View view) {
        int asciiValue = 0;
        String characterValue = ((EditText) findViewById(R.id.characterValue)).getText().toString();
        if (characterValue.matches("")) {
            TextView asciiTextView = (TextView) findViewById(R.id.ascii);
            asciiTextView.setText("ASCII value");
            Toast.makeText(this, "Enter a Character", Toast.LENGTH_SHORT).show();
            return;
        } else {
            //asciiValue = Integer.parseInt(characterValue);
            char character = characterValue.charAt(0);
            asciiValue = (int) character;
            TextView asciiTextView = (TextView) findViewById(R.id.ascii);
            asciiTextView.setText("ASCII value: " + asciiValue);
        }
    }
}