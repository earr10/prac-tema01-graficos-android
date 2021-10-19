package com.example.practema01graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class Graficos3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficos3);

        SpecialView objGrafico = new SpecialView(this);
        setContentView(objGrafico);
    }

    private class SpecialView extends View {

        public SpecialView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            canvas.drawColor(Color.WHITE);

            Paint pincelBlanco = new Paint();
            Paint pincelGris = new Paint();

            for (int i = 30; i < alto; i += 30) {
                canvas.drawLine(0, i, ancho, i, pincelBlanco);
                canvas.drawText(""+i, 30, i, pincelGris);
            }

            pincelBlanco.setTextSize(40);
            pincelBlanco.setAntiAlias(true);
            canvas.drawText("Altura: "+alto, 100, alto/2, pincelBlanco);
        }
    }
}