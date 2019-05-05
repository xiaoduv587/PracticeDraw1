package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author xiaodu
 */
public class Practice2DrawCircleView extends View {

    /**
     *  实心圆
     */
    private Paint mFillCirclePaint=new Paint();
    /**
     * 空心圆
     */
    private Paint mStockCirclePaint=new Paint();
    /**
     * 蓝色实心圆
     */
    private Paint mBlueFillCirclePaint=new Paint();

    /**
     * 线宽为20的空心圆
     */
    private Paint mStockWidthCirclePaint=new Paint();




    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        //实心圆
        mFillCirclePaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300,120,100,mFillCirclePaint);

        //空心圆
        mStockCirclePaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(600,120,100,mStockCirclePaint);

        //蓝色实心圆
        mBlueFillCirclePaint.setColor(Color.BLUE);
        mBlueFillCirclePaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300,400,100,mBlueFillCirclePaint);

        //线宽为 20 的空心圆
        mStockWidthCirclePaint.setStrokeWidth(20);
        mStockWidthCirclePaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(600,400,100,mStockWidthCirclePaint);

    }
}
