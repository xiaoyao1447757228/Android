package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CirclerView extends View {
    //设置画笔变量
    Paint mPaint1;
    // 自定义View有四个构造函数
    // 如果View是在Java代码里面new的，则调用第一个构造函数
//    public CirclerView(Context context) {
//        super(context);
//        init();
//    }
    // 如果View是在.xml里声明的，则调用第二个构造函数
    // 自定义属性是从AttributeSet参数传进来的
    public CirclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    // 不会自动调用
    // 一般是在第二个构造函数里主动调用
    // 如View有style属性时
//    public CirclerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//        init();
//    }
    //API21之后才使用
    // 不会自动调用
    // 一般是在第二个构造函数里主动调用
    // 如View有style属性时
//    public CirclerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }
    private void init() {
        mPaint1=new Paint();
        mPaint1.setColor(Color.BLUE);
        mPaint1.setStrokeWidth(5f);
        mPaint1.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width=getWidth();
        int height=getHeight();

        int r=Math.min(width,height)/2;
        canvas.drawCircle(width/2,height/2,r,mPaint1);
    }
}
