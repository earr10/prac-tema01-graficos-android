package com.example.practema01graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.practema01graficos.R.id.btnSeis;
import static com.example.practema01graficos.R.id.start;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = (Button) findViewById(R.id.btnUno);
        btnDos = (Button) findViewById(R.id.btnDos);
        btnTres = (Button) findViewById(R.id.btnTres);
        btnCuatro = (Button) findViewById(R.id.btnCuatro);
        btnCinco = (Button) findViewById(R.id.btnCinco);
        btnSeis = (Button) findViewById(R.id.btnSeis);
        btnSiete = (Button) findViewById(R.id.btnSiete);
        btnOcho = (Button) findViewById(R.id.btnOcho);

        btnUno.setOnClickListener(this);
        btnDos.setOnClickListener(this);
        btnTres.setOnClickListener(this);
        btnCuatro.setOnClickListener(this);
        btnCinco.setOnClickListener(this);
        btnSeis.setOnClickListener(this);
        btnSiete.setOnClickListener(this);
        btnOcho.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnUno:
                Intent intent1 = new Intent(getApplicationContext(), Graficos1Activity.class);
                startActivity(intent1);
                break;
            case R.id.btnDos:
                Intent intent2 = new Intent(getApplicationContext(), Graficos2Activity.class);
                startActivity(intent2);
                break;
            case R.id.btnTres:
                Intent intent3 = new Intent(getApplicationContext(), Graficos3Activity.class);
                startActivity(intent3);
                break;
            case R.id.btnCuatro:
                Intent intent4 = new Intent(getApplicationContext(), Graficos4Activity.class);
                startActivity(intent4);
                break;
            case R.id.btnCinco:
                Intent intent5 = new Intent(getApplicationContext(), Graficos5Activity.class);
                startActivity(intent5);
                break;
            case R.id.btnSeis:
                Intent intent6 = new Intent(getApplicationContext(), Graficos6Activity.class);
                startActivity(intent6);
                break;
            case R.id.btnSiete:
                Intent intent7 = new Intent(getApplicationContext(), Graficos7Activity.class);
                startActivity(intent7);
                break;
            case R.id.btnOcho:
                Intent intent8 = new Intent(getApplicationContext(), Animacion1Activity.class);
                startActivity(intent8);
        }
    }
}