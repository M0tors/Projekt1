package com.ostaszewski.damian.aplikacja3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton Ib1,Ib2;
    int liczba1 = 1;
    int liczba2 = 1;
    int wynik = 0;
    double licz1 = 1.589;
    double licz2 = 31.5489;
    double wyn2k;
    boolean falsz = false;
    boolean prawda = true;
    int warunek = 0;
    String tablica[];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ib1 = (ImageButton) findViewById(R.id.imageButton28);
        Ib2 = (ImageButton) findViewById(R.id.imageButton29);

        Ib1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Sms.class);
                startActivity(i);
            }

        });

        Ib2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Dane.class);
                startActivity(i);
            }

        });

        wynik = liczba1 * liczba2;
        wyn2k = licz1 / licz2;

        tablica = new String[] {"Kasia","Magda","Jula","Kamil", "Agata", "Hubert", "Damiś"};

        for (int i=0; i<tablica.length; i++) {
            Log.d("Tablica : ", tablica[i]);
        }





    }
}
