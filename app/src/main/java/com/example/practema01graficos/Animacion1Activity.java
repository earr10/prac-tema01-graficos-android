package com.example.practema01graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Animacion1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animacion1);

        SpecialView objGrafico = new SpecialView(this);
        setContentView(objGrafico);
    }

    private class SpecialView extends View {
        float x = 50;
        float y = 50;
        String texto = "";

        Path path = new Path();

        public SpecialView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            canvas.drawColor(Color.LTGRAY);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.RED);
            canvas.drawCircle(x, y, 20, paint);
            paint.setColor(Color.BLACK);
            paint.setTextSize(35);
            canvas.drawText(texto, x,y, paint);
            canvas.drawText("x: " + x, 100, 50, paint);
            canvas.drawText("y: " + y, 100, 90, paint);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                texto = "DOWN";
                x = event.getX();
                y = event.getY();
                invalidate();
            }
            if (event.getAction() == MotionEvent.ACTION_UP) {
                texto = "UP";
                x = event.getX();
                y = event.getY();
                invalidate();
            }
            if (event.getAction() == MotionEvent.ACTION_MOVE) {
                texto = "MOVE";
                x = event.getX();
                y = event.getY();
                invalidate();
            }
            return true;
        }
    }
}