package com.example.ezequiel.crazyeights;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ezequiel on 02/04/15.
 */
public class TitleView extends View{

    private Bitmap titleGraphic;

    public TitleView(Context context){
        super(context);
        titleGraphic = BitmapFactory.decodeResource(getResources(),R.drawable.title_graphic);
    }

    @Override
    public void onDraw(Canvas canvas){
        canvas.drawBitmap(titleGraphic, 0, 0, null);
    }

    public boolean onTouchEvent(MotionEvent event){
        int eventaction = event.getAction();
        int X = (int)event.getX();
        int Y = (int)event.getY();

        switch (eventaction){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        invalidate();
        return true;
    }

}
