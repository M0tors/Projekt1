package com.ostaszewski.damian.aplikacja3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 28.03.2017.
 */

public class Dane extends AppCompatActivity {

   EditText et1;
    Button bt1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dane);

        final List<String> list = new ArrayList<String>();

        et1 = (EditText) findViewById(R.id.editText3);
        bt1 = (Button) findViewById(R.id.button2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                list.add(et1.getText().toString());
                Log.d("Tablica : ", String.valueOf(list));

            }
        });


    }
}



