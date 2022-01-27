package com.example.front;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class Equipos extends AppCompatActivity {

    ArrayList<Cricketer> array = new ArrayList<>();
    int contador =0;

    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13,tx14,tx15,tx16;
    Button btnSalir;
    Button btnVolver;
    Button btnReiniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipos);

        btnSalir = (Button) findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
            }
        });

        btnVolver = (Button) findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        btnReiniciar = (Button) findViewById(R.id.btnReiniciar);
        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(array);

                contador=array.size();
                switch (contador){
                    case 1:
                        tx1.setText(array.get(0).getCricketerName());
                        break;
                    case 2:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        break;
                    case 3:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        break;
                    case 4:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        break;
                    case 5:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        break;
                    case 6:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        tx6.setText(array.get(5).getCricketerName());
                        break;
                    case 7:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        tx6.setText(array.get(5).getCricketerName());
                        tx7.setText(array.get(6).getCricketerName());
                        break;
                    case 8:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        tx6.setText(array.get(5).getCricketerName());
                        tx7.setText(array.get(6).getCricketerName());
                        tx8.setText(array.get(7).getCricketerName());
                        break;
                    case 9:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        tx6.setText(array.get(5).getCricketerName());
                        tx7.setText(array.get(6).getCricketerName());
                        tx8.setText(array.get(7).getCricketerName());
                        tx9.setText(array.get(8).getCricketerName());
                        break;
                    case 10:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        tx6.setText(array.get(5).getCricketerName());
                        tx7.setText(array.get(6).getCricketerName());
                        tx8.setText(array.get(7).getCricketerName());
                        tx9.setText(array.get(8).getCricketerName());
                        tx10.setText(array.get(9).getCricketerName());
                        break;
                    case 11:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        tx6.setText(array.get(5).getCricketerName());
                        tx7.setText(array.get(6).getCricketerName());
                        tx8.setText(array.get(7).getCricketerName());
                        tx9.setText(array.get(8).getCricketerName());
                        tx10.setText(array.get(9).getCricketerName());
                        tx11.setText(array.get(10).getCricketerName());
                        break;
                    case 12:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        tx6.setText(array.get(5).getCricketerName());
                        tx7.setText(array.get(6).getCricketerName());
                        tx8.setText(array.get(7).getCricketerName());
                        tx9.setText(array.get(8).getCricketerName());
                        tx10.setText(array.get(9).getCricketerName());
                        tx11.setText(array.get(10).getCricketerName());
                        tx12.setText(array.get(11).getCricketerName());
                        break;
                    case 13:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        tx6.setText(array.get(5).getCricketerName());
                        tx7.setText(array.get(6).getCricketerName());
                        tx8.setText(array.get(7).getCricketerName());
                        tx9.setText(array.get(8).getCricketerName());
                        tx10.setText(array.get(9).getCricketerName());
                        tx11.setText(array.get(10).getCricketerName());
                        tx12.setText(array.get(11).getCricketerName());
                        tx13.setText(array.get(12).getCricketerName());
                        break;
                    case 14:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        tx6.setText(array.get(5).getCricketerName());
                        tx7.setText(array.get(6).getCricketerName());
                        tx8.setText(array.get(7).getCricketerName());
                        tx9.setText(array.get(8).getCricketerName());
                        tx10.setText(array.get(9).getCricketerName());
                        tx11.setText(array.get(10).getCricketerName());
                        tx12.setText(array.get(11).getCricketerName());
                        tx13.setText(array.get(12).getCricketerName());
                        tx14.setText(array.get(13).getCricketerName());
                        break;
                    case 15:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        tx6.setText(array.get(5).getCricketerName());
                        tx7.setText(array.get(6).getCricketerName());
                        tx8.setText(array.get(7).getCricketerName());
                        tx9.setText(array.get(8).getCricketerName());
                        tx10.setText(array.get(9).getCricketerName());
                        tx11.setText(array.get(10).getCricketerName());
                        tx12.setText(array.get(11).getCricketerName());
                        tx13.setText(array.get(12).getCricketerName());
                        tx14.setText(array.get(13).getCricketerName());
                        tx15.setText(array.get(14).getCricketerName());
                        break;
                    case 16:
                        tx1.setText(array.get(0).getCricketerName());
                        tx2.setText(array.get(1).getCricketerName());
                        tx3.setText(array.get(2).getCricketerName());
                        tx4.setText(array.get(3).getCricketerName());
                        tx5.setText(array.get(4).getCricketerName());
                        tx6.setText(array.get(5).getCricketerName());
                        tx7.setText(array.get(6).getCricketerName());
                        tx8.setText(array.get(7).getCricketerName());
                        tx9.setText(array.get(8).getCricketerName());
                        tx10.setText(array.get(9).getCricketerName());
                        tx11.setText(array.get(10).getCricketerName());
                        tx12.setText(array.get(11).getCricketerName());
                        tx13.setText(array.get(12).getCricketerName());
                        tx14.setText(array.get(13).getCricketerName());
                        tx15.setText(array.get(14).getCricketerName());
                        tx16.setText(array.get(15).getCricketerName());
                        break;
                }
            }
        });




        tx1 = (TextView) findViewById(R.id.txt1);
        tx2 = (TextView) findViewById(R.id.txt2);
        tx3 = (TextView) findViewById(R.id.txt3);
        tx4 = (TextView) findViewById(R.id.txt4);
        tx5 = (TextView) findViewById(R.id.txt5);
        tx6 = (TextView) findViewById(R.id.txt6);
        tx7 = (TextView) findViewById(R.id.txt7);
        tx8 = (TextView) findViewById(R.id.txt8);
        tx9 = (TextView) findViewById(R.id.txt9);
        tx10 = (TextView) findViewById(R.id.txt10);
        tx11 = (TextView) findViewById(R.id.txt11);
        tx12 = (TextView) findViewById(R.id.txt12);
        tx13 = (TextView) findViewById(R.id.txt13);
        tx14 = (TextView) findViewById(R.id.txt14);
        tx15 = (TextView) findViewById(R.id.txt15);
        tx16 = (TextView) findViewById(R.id.txt16);

        array = (ArrayList<Cricketer>) getIntent().getExtras().getSerializable("list");


        Collections.shuffle(array);

        contador=array.size();
        switch (contador){
            case 1:
                tx1.setText(array.get(0).getCricketerName());
                break;
            case 2:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                break;
            case 3:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                break;
            case 4:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                break;
            case 5:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                break;
            case 6:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                tx6.setText(array.get(5).getCricketerName());
                break;
            case 7:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                tx6.setText(array.get(5).getCricketerName());
                tx7.setText(array.get(6).getCricketerName());
                break;
            case 8:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                tx6.setText(array.get(5).getCricketerName());
                tx7.setText(array.get(6).getCricketerName());
                tx8.setText(array.get(7).getCricketerName());
                break;
            case 9:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                tx6.setText(array.get(5).getCricketerName());
                tx7.setText(array.get(6).getCricketerName());
                tx8.setText(array.get(7).getCricketerName());
                tx9.setText(array.get(8).getCricketerName());
                break;
            case 10:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                tx6.setText(array.get(5).getCricketerName());
                tx7.setText(array.get(6).getCricketerName());
                tx8.setText(array.get(7).getCricketerName());
                tx9.setText(array.get(8).getCricketerName());
                tx10.setText(array.get(9).getCricketerName());
                break;
            case 11:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                tx6.setText(array.get(5).getCricketerName());
                tx7.setText(array.get(6).getCricketerName());
                tx8.setText(array.get(7).getCricketerName());
                tx9.setText(array.get(8).getCricketerName());
                tx10.setText(array.get(9).getCricketerName());
                tx11.setText(array.get(10).getCricketerName());
                break;
            case 12:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                tx6.setText(array.get(5).getCricketerName());
                tx7.setText(array.get(6).getCricketerName());
                tx8.setText(array.get(7).getCricketerName());
                tx9.setText(array.get(8).getCricketerName());
                tx10.setText(array.get(9).getCricketerName());
                tx11.setText(array.get(10).getCricketerName());
                tx12.setText(array.get(11).getCricketerName());
                break;
            case 13:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                tx6.setText(array.get(5).getCricketerName());
                tx7.setText(array.get(6).getCricketerName());
                tx8.setText(array.get(7).getCricketerName());
                tx9.setText(array.get(8).getCricketerName());
                tx10.setText(array.get(9).getCricketerName());
                tx11.setText(array.get(10).getCricketerName());
                tx12.setText(array.get(11).getCricketerName());
                tx13.setText(array.get(12).getCricketerName());
                break;
            case 14:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                tx6.setText(array.get(5).getCricketerName());
                tx7.setText(array.get(6).getCricketerName());
                tx8.setText(array.get(7).getCricketerName());
                tx9.setText(array.get(8).getCricketerName());
                tx10.setText(array.get(9).getCricketerName());
                tx11.setText(array.get(10).getCricketerName());
                tx12.setText(array.get(11).getCricketerName());
                tx13.setText(array.get(12).getCricketerName());
                tx14.setText(array.get(13).getCricketerName());
                break;
            case 15:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                tx6.setText(array.get(5).getCricketerName());
                tx7.setText(array.get(6).getCricketerName());
                tx8.setText(array.get(7).getCricketerName());
                tx9.setText(array.get(8).getCricketerName());
                tx10.setText(array.get(9).getCricketerName());
                tx11.setText(array.get(10).getCricketerName());
                tx12.setText(array.get(11).getCricketerName());
                tx13.setText(array.get(12).getCricketerName());
                tx14.setText(array.get(13).getCricketerName());
                tx15.setText(array.get(14).getCricketerName());
                break;
            case 16:
                tx1.setText(array.get(0).getCricketerName());
                tx2.setText(array.get(1).getCricketerName());
                tx3.setText(array.get(2).getCricketerName());
                tx4.setText(array.get(3).getCricketerName());
                tx5.setText(array.get(4).getCricketerName());
                tx6.setText(array.get(5).getCricketerName());
                tx7.setText(array.get(6).getCricketerName());
                tx8.setText(array.get(7).getCricketerName());
                tx9.setText(array.get(8).getCricketerName());
                tx10.setText(array.get(9).getCricketerName());
                tx11.setText(array.get(10).getCricketerName());
                tx12.setText(array.get(11).getCricketerName());
                tx13.setText(array.get(12).getCricketerName());
                tx14.setText(array.get(13).getCricketerName());
                tx15.setText(array.get(14).getCricketerName());
                tx16.setText(array.get(15).getCricketerName());
                break;
        }



    }
}