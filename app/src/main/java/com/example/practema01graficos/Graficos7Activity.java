package com.example.practema01graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

public class Graficos7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficos7);

        GraficoView objGrafico = new GraficoView(this);
        setContentView(objGrafico);
    }

    private class GraficoView extends View {
        public GraficoView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            canvas.drawColor(Color.WHITE);
            Paint paint = new Paint();
            paint.setTextSize(60);
            paint.setAntiAlias(true);
            int width = getWidth();

            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.STROKE);
            Path path = new Path();
            Path.Direction dir = Path.Direction.CCW;
            float radio = 200;
            path.addCircle(width / 2, 500, radio, dir);
            path.offset(0, 0); // Dibujar el circulo desde el centro
            float hOffSet = 0; // Gira en el circulo
            float vOffSet = -20; // Se sale o entra al circulo
            canvas.drawPath(path, paint);
            paint.setColor(Color.BLACK);
            canvas.drawTextOnPath("Texto en el path externo punto inicial" + hOffSet, path,
                    hOffSet, vOffSet, paint);

            hOffSet = 200;
            vOffSet = 100;
            paint.setStyle(Paint.Style.FILL);
            paint.setTextSize(40);
            canvas.drawTextOnPath("Texto interior comenzando a " + hOffSet +
                    " del punto inicial", path, hOffSet, vOffSet, paint);
        }
    }
}