package com.example.admin.tpandroid9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Traceur {

    public static final String PROGRESS = "progress";
    int number = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bouton = ((Button) findViewById(R.id.button));
        final TextView increment = ((TextView) findViewById(R.id.Text2));

        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number++;

                increment.setText(number+"");

            }

        });
    }

        @Override
        protected void onRestoreInstanceState(Bundle savedInstanceState)
        {
            super.onRestoreInstanceState(savedInstanceState);
            String compteur = savedInstanceState.getString(PROGRESS);
            number = Integer.parseInt(compteur);
            TextView increment = ((TextView) findViewById(R.id.Text2));
            increment.setText(compteur);
        }

        @Override
        protected void onSaveInstanceState(Bundle outState)
        {
            super.onSaveInstanceState(outState);
            TextView increment = (TextView) findViewById(R.id.Text2);
            String compteur = increment.getText().toString();
            outState.putString(PROGRESS, compteur);

        }





}
