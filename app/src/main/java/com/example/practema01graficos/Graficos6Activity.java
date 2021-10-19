package com.example.practema01graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

public class Graficos6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficos6);

        SpecialView specialView = new SpecialView(this);
        setContentView(specialView);
    }

    public class SpecialView extends View {

        public SpecialView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);
            Paint paint = new Paint();
            paint.setTextSize(60);
            paint.setAntiAlias(true);

            //Traslada el origen del canvas
            int x = 80;
            int y = 400;
            canvas.translate(x, y);

            //Rectangulo bounding-box de un texto
            String texto = "Rotación del canvas";
            Rect bounds = new Rect();
            paint.getTextBounds(texto, 0, texto.length(), bounds);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawRect(bounds, paint);
            canvas.save();

            //Centro del rectangulo
            float centerX = bounds.exactCenterX();
            float centerY = bounds.exactCenterY();

            //Rotación canvas
            canvas.rotate(-45, centerX, centerY);
            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawText(texto, 0, 0, paint);

            //Restablece el canvas
            canvas.restore();
            canvas.drawText("Tras la rotación restore", 100, 300, paint);
        }
    }
}