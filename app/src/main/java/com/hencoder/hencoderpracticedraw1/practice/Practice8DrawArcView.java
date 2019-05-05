package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author xiaodu
 */
public class Practice8DrawArcView extends View {

    /**
     * 绘制弧形和扇形
     */
    private Paint mDrawArcPaint = new Paint();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

//                      left.top,right,bottom描述的是这个弧形所在的椭圆，startAngle是弧形的起始角度(x轴的正向，即正右的方向，是0度的位置;顺时针为正角度，逆时针为负角度),sweepAngle是弧形划过的角度；useCenter表示是否连接到圆心，如果不连接到圆心，就是弧形，如果连接到圆心，就是扇形。
//        canvas.drawArc(200,100,800,500,-110,100,true,mDrawArcPaint);
        //先填充
        mDrawArcPaint.setStyle(Paint.Style.FILL);
        //绘制弧线
        canvas.drawArc(200,100,800,500,-110,100,true,mDrawArcPaint);
        //绘制扇形
        canvas.drawArc(200,100,800,500,20,140,false,mDrawArcPaint);
        //画线模式
        mDrawArcPaint.setStyle(Paint.Style.STROKE);
        //绘制线
        canvas.drawArc(200,100,800,500,180,60,false,mDrawArcPaint);


    }
}
