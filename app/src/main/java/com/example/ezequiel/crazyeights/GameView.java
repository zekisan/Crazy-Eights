package com.example.ezequiel.crazyeights;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ezequiel on 03/04/15.
 */
public class GameView extends View {

    public GameView(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){

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
