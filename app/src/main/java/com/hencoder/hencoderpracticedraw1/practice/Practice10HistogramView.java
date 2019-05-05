package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author xiaodu
 */
public class Practice10HistogramView extends View {

    private Paint mPaint = new Paint();
    private Paint mGreenPaint = new Paint();


    private final int startX = 100;
    private final int startY = 100;
    private final int stopX = 950;
    private final int stopY = 600;

    //矩形起始X值
    private int rectStartX = 0;
    //矩形结束X值
    private int rectStopX = 0;


    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        //设置画笔颜色
        mPaint.setColor(Color.WHITE);
        //设置画笔宽度
        mPaint.setStrokeWidth(2);

        mGreenPaint.setColor(Color.GREEN);

        /**
         * 1.绘制外层x轴和y轴
         */
        //y轴的线
        canvas.drawLine(100, 100, 100, 600, mPaint);
        //x轴的线
        canvas.drawLine(100, 600, 950, 600, mPaint);


        //给初始矩形赋值
        rectStartX = startX + 40;
        rectStopX = rectStartX + 60;

        /**
         * 2.绘制里面的直方图
         */
        mPaint.setTextSize(18);
        //绘制矩形
        canvas.drawRect(rectStartX, stopY - 2, rectStopX, stopY, mPaint);
        //绘制第一个文字
        canvas.drawText("Froyo", rectStartX, stopY + 20, mPaint);

        //给初始矩形赋值
        rectStartX = rectStopX + 20;
        rectStopX = rectStartX + 60;

        //绘制矩形
        canvas.drawRect(rectStartX, stopY - 20, rectStopX, stopY, mGreenPaint);
        //绘制第二个文字
        canvas.drawText("G B", rectStartX + 15, stopY + 20, mPaint);

        //给初始矩形赋值
        rectStartX = rectStopX + 20;
        rectStopX = rectStartX + 60;

        //绘制矩形
        canvas.drawRect(rectStartX, stopY - 20, rectStopX, stopY, mGreenPaint);
        //绘制第三个文字
        canvas.drawText("IC S", rectStartX + 15, stopY + 20, mPaint);

        //给初始矩形赋值
        rectStartX = rectStopX + 20;
        rectStopX = rectStartX + 60;

        //绘制矩形
        canvas.drawRect(rectStartX, stopY - 120, rectStopX, stopY, mGreenPaint);
        //绘制第四个文字
        canvas.drawText("JB", rectStartX + 15, stopY + 20, mPaint);

        //给初始矩形赋值
        rectStartX = rectStopX + 20;
        rectStopX = rectStartX + 60;

        //绘制矩形
        canvas.drawRect(rectStartX, stopY - 260, rectStopX, stopY, mGreenPaint);
        //绘制第四个文字
        canvas.drawText("KitKat", rectStartX + 15, stopY + 20, mPaint);

        //给初始矩形赋值
        rectStartX = rectStopX + 20;
        rectStopX = rectStartX + 60;

        //绘制矩形
        canvas.drawRect(rectStartX, stopY - 280, rectStopX, stopY, mGreenPaint);
        //绘制第四个文字
        canvas.drawText("L", rectStartX + 15, stopY + 20, mPaint);

        //给初始矩形赋值
        rectStartX = rectStopX + 20;
        rectStopX = rectStartX + 60;

        //绘制矩形
        canvas.drawRect(rectStartX, stopY - 100, rectStopX, stopY, mGreenPaint);
        //绘制第7个文字
        canvas.drawText("M", rectStartX + 15, stopY + 20, mPaint);

    }
}
