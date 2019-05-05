package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author xiaodu
 */
public class Practice11PieChartView extends View {

    private Paint mPaint=new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图


        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.RED);
        canvas.drawArc(90, 40, 480, 430, -180, 120, true, mPaint);
        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(100, 50, 500, 450, -60, 59, true, mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(100, 50, 500, 450, 180, -95, true, mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawArc(100, 50, 500, 450, 80, -35, true, mPaint);
        mPaint.setColor(Color.GRAY);
        canvas.drawArc(100, 50, 500, 450, 40, -17, true, mPaint);
        mPaint.setColor(Color.CYAN);
        canvas.drawArc(100, 50, 500, 450, 20, -17, true, mPaint);
        mPaint.setColor(Color.WHITE);
        canvas.drawLine(70,25,140,25,mPaint);
        canvas.drawLine(140,25,170,70,mPaint);
        canvas.drawText("AAA",30,30,mPaint);

        canvas.drawLine(70,400,140,400,mPaint);
        canvas.drawLine(140,400,148,390,mPaint);
        canvas.drawText("BBB",30,410,mPaint);

        canvas.drawLine(450,100,510,70,mPaint);
        canvas.drawLine(510,70,570,70,mPaint);
        canvas.drawText("CCC",580,70,mPaint);

        canvas.drawLine(500,265,550,270,mPaint);
        canvas.drawText("DDD",555,280,mPaint);

        canvas.drawLine(470,360,560,360,mPaint);
        canvas.drawText("EEE",566,366,mPaint);

        canvas.drawLine(390,440,480,440,mPaint);
        canvas.drawLine(480,440,530,420,mPaint);
        canvas.drawText("FFF",533,422,mPaint);

    }
}
