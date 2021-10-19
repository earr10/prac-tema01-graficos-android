package com.example.practema01graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Graficos1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficos1);

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
            pincel.setColor(Color.WHITE);
            canvas.drawPaint(pincel);
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            pincel.setColor(Color.RED);
            pincel.setTextSize(50);
            pincel.setAntiAlias(true);
            canvas.drawText("Ancho: " + ancho + " alto: " + alto, 20, 40, pincel);
            pincel.setColor(Color.rgb(0, 0, 0));
            canvas.drawLine(0, 41, ancho, alto, pincel);

            Toast.makeText(getContext(), "Ancho: " + ancho + " alto: " + alto,
                    Toast.LENGTH_SHORT).show();
        }
    }
}