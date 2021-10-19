package com.example.practema01graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class Graficos4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficos4);

        SpecialView specialView = new SpecialView(this);
        setContentView(specialView);
    }

    private class SpecialView extends View {

        public SpecialView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);
            Paint pincel = new Paint();
            pincel.setColor(Color.BLACK);
            pincel.setTextSize(30);
            pincel.setAntiAlias(true);
            int width = getMeasuredWidth();
            int heigh = getMeasuredHeight();
            int bottom = getBottom();
            int right = getRight();
            pincel.setTextAlign(Paint.Align.CENTER);
            canvas.drawText("Width: " + width, width/2, 40, pincel);
            canvas.drawText("Height: " + heigh, width/2, 80, pincel);
            canvas.drawText("Right: " + right, width/2, 120, pincel);
            canvas.drawText("Botttom" + bottom, width/2, 160, pincel);

            pincel.setColor(Color.BLUE);
            canvas.drawLine(0,0,right,bottom,pincel);
            canvas.drawLine(right,0,0,bottom,pincel);
        }
    }
}

