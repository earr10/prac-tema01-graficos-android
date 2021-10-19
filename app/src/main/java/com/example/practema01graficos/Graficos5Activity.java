package com.example.practema01graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

public class Graficos5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graficos5);

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
            Paint pincel = new Paint();
            pincel.setColor(Color.BLACK);
            pincel.setStyle(Paint.Style.STROKE);
            pincel.setStrokeWidth(2);
            int width = getMeasuredWidth();

            Path path = new Path();
            path.moveTo(0, 0);
            for (int i = 1; i < width; i++) {
                path.lineTo(i,(float) Math.sin(i/20f)*(-50f));
            }
            path.offset(0,100);
            canvas.drawPath(path,pincel);

            float[] intervalos = {10,10};
            DashPathEffect dashPathEffect = new DashPathEffect(intervalos,1);
            pincel.setPathEffect(dashPathEffect);
            path.offset(0,100);
            canvas.drawPath(path,pincel);

            float[] intervalos2 = {10,10,2,10};
            DashPathEffect dashPathEffect2 = new DashPathEffect(intervalos2,0);
            pincel.setPathEffect(dashPathEffect2);
            path.offset(0,100);
            canvas.drawPath(path,pincel);

            float[] intervalos3 = {2,4};
            DashPathEffect dashPathEffect3 = new DashPathEffect(intervalos3,0);
            pincel.setPathEffect(dashPathEffect3);
            path.offset(0,100);
            canvas.drawPath(path,pincel);
        }
    }
}