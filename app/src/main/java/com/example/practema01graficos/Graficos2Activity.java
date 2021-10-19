package com.example.practema01graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

public class Graficos2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficos2);

        GraficoView objGrafico = new GraficoView(this);
        setContentView(objGrafico);
    }

    private class GraficoView extends View {

        public GraficoView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint pincel = new Paint();
            pincel.setColor(Color.BLACK);
            canvas.drawPaint(pincel);
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            pincel.setTextSize(30);
            pincel.setAntiAlias(true);
            pincel.setColor(Color.rgb(0, 100, 20));

            canvas.drawLine(ancho / 2, 0, ancho / 2, alto, pincel);
            pincel.setColor(Color.WHITE);
            pincel.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText("Align.RIGHT", ancho / 2, 160, pincel);
            pincel.setTextAlign(Paint.Align.CENTER);
            canvas.drawText("Align.CENTER", ancho / 2, 120, pincel);
            pincel.setTextAlign(Paint.Align.LEFT);
            canvas.drawText("Align.LEFT", ancho / 2, 80, pincel);

            pincel.setTextSkewX(0.2f);
            canvas.drawText("TextSkewX", 20, 210, pincel);
            pincel.setTextSkewX(-0.2f);
            canvas.drawText("TextSkewX", ancho / 2, 210, pincel);
            pincel.setTextSkewX(0f);

            pincel.setTextScaleX(2f);
            canvas.drawText("TextScaleX", 10, 250, pincel);
            pincel.setTextScaleX(-2f);
            canvas.drawText("TextScaleX", ancho, 290, pincel);
            pincel.setTextSize(60);
            pincel.setTextScaleX(0.5f);
            canvas.drawText("TextScaleX", ancho / 2, 360, pincel);
            pincel.setTextScaleX(1f);
            pincel.setTextSize(30);

            pincel.setTypeface(Typeface.SANS_SERIF);
            canvas.drawText("SANS SERIF", 20, 330, pincel);
            pincel.setTypeface(Typeface.SERIF);
            canvas.drawText("SERIF", 20, 450, pincel);
            pincel.setTypeface(Typeface.DEFAULT);

            pincel.setTextSize(50);
            pincel.setAntiAlias(false);
            canvas.drawText("AntiAlias false", 20, 500, pincel);
            pincel.setAntiAlias(true);
            canvas.drawText("AntiAlias true", 20, 550, pincel);
        }
    }
}