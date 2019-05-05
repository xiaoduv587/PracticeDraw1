package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * todo 没效果
 * @author xiaodu
 */
public class Practice4DrawPointView extends View {

    /**
     *  画点
     */
    private Paint mRoundPointPaint=new Paint();
    /**
     * 画方点
     */
    private Paint mSquarePointPaint=new Paint();

    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

        //注意：需要设置线的宽度
        //圆点
        mRoundPointPaint.setStrokeCap(Paint.Cap.ROUND);
        mRoundPointPaint.setStrokeWidth(60);
        canvas.drawPoint(200,200,mRoundPointPaint);

        //方点
        mSquarePointPaint.setStrokeCap(Paint.Cap.SQUARE);
        mSquarePointPaint.setStrokeWidth(60);

        canvas.drawPoint(400,200,mSquarePointPaint);

    }
}
