package com.example.admin.tpandroid9;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by admin on 13/06/2017.
 */

public class SecondActivity extends Traceur {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);
        Button bouton2 = ((Button) findViewById(R.id.button2));

        bouton2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent2);

            }

        });
    }


}
