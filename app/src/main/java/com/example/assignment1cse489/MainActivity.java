package com.example.assignment1cse489;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bclear;
    TextView taka, t500, t100, t50, t20, t10, t5, t2, t1;

    int Taka = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bclear = findViewById(R.id.bclear);

        taka = findViewById(R.id.taka);
        t500 = findViewById(R.id.t500);
        t100 = findViewById(R.id.t100);
        t50 = findViewById(R.id.t50);
        t20 = findViewById(R.id.t20);
        t10 = findViewById(R.id.t10);
        t5 = findViewById(R.id.t5);
        t2 = findViewById(R.id.t2);
        t1 = findViewById(R.id.t1);

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taka.setText("Taka : ");
                clearVangti();
                Taka = 0;

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Taka = (Taka*10)+1;
                taka.setText("Taka : "+ Taka);
                doVangti(Taka);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Taka = (Taka*10)+2;
                taka.setText("Taka : "+ Taka);
                doVangti(Taka);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Taka = (Taka*10)+3;
                taka.setText("Taka : "+ Taka);
                doVangti(Taka);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Taka = (Taka*10)+4;
                taka.setText("Taka : "+ Taka);
                doVangti(Taka);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Taka = (Taka*10)+5;
                taka.setText("Taka : "+ Taka);
                doVangti(Taka);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Taka = (Taka*10)+6;
                taka.setText("Taka : "+ Taka);
                doVangti(Taka);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Taka = (Taka*10)+7;
                taka.setText("Taka : "+ Taka);
                doVangti(Taka);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Taka = (Taka*10)+8;
                taka.setText("Taka : "+ Taka);
                doVangti(Taka);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Taka = (Taka*10)+9;
                taka.setText("Taka : "+ Taka);
                doVangti(Taka);
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Taka = (Taka*10)+0;
                taka.setText("Taka : "+ Taka);
                doVangti(Taka);
            }
        });

    }

    void doVangti(int x){
        ArrayList<Integer> notes = new ArrayList<Integer>();
        notes.add(500);
        notes.add(100);
        notes.add(50);
        notes.add(20);
        notes.add(10);
        notes.add(5);
        notes.add(2);
        notes.add(1);
        int input = x;
        int mod = 0;
        clearVangti();
        for (int i = 0; i < notes.size(); i++) {
            Log.d("input : ", String.valueOf(input));
            if(input>=notes.get(i)){
                mod = input / notes.get(i);
                int modRes = input % notes.get(i);
                Log.d("Divide : ", String.valueOf(mod));
                Log.d("With Div : ", String.valueOf(notes.get(i)));

                if(modRes>=0){
                    Log.d("In Loop for  ",String.valueOf(notes.get(i)));
                    switch (notes.get(i)){
                        case 500:
                            t500.setText("500 : "+mod);
                            Log.d("Printed ","500");
                            break;
                        case 100:
                            t100.setText("100 : "+mod);
                            Log.d("Printed ","100");
                            break;
                        case 50:
                            t50.setText("50 : "+mod);
                            Log.d("Printed ","50");
                            break;
                        case 20:
                            t20.setText("20 : "+mod);
                            Log.d("Printed ","20");
                            break;
                        case 10:
                            t10.setText("10 : "+mod);
                            Log.d("Printed ","10");
                            break;
                        case 5:
                            t5.setText("5 : "+mod);
                            Log.d("Printed ","5");
                            break;
                        case 2:
                            t2.setText("2 : "+mod);
                            Log.d("Printed ","2");
                            break;
                        case 1:
                            t1.setText("1 : "+mod);
                            Log.d("Printed ","1");
                            break;
                    }
                }
                input = modRes;
                Log.d("input after mod : ", String.valueOf(input));
            }


        }


    }

    void clearVangti(){
        t1.setText("1 : ");
        t2.setText("2 : ");
        t5.setText("5 : ");
        t10.setText("10 : ");
        t20.setText("20: ");
        t50.setText("50 : ");
        t100.setText("100 : ");
        t500.setText("500 : ");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int t = savedInstanceState.getInt("Taka");
        Log.d("got value of saved : ", String.valueOf(t));

        Taka = t;
        taka.setText("Taka : "+ Taka);
        doVangti(Taka);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if ( outState == null )
        {
            int t = Taka;
            outState.putInt("Taka",t);
        }
        else {
            int t = Taka;
            outState.putInt("Taka",t);
        }
    }
}