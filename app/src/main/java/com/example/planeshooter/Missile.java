package com.example.planeshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Missile {
    int X ,Y;
    int mVelocity;
    Bitmap missile;
    public Missile(Context context){
missile= BitmapFactory.decodeResource(context.getResources(), R.drawable.missile);
X= GameView.dWidth/2 -getMissileWidth()/2;
Y= GameView.dHeight - GameView.tankHeight -getMissileHeight()/2;
mVelocity=50;
    }
    public int getMissileWidth(){
        return missile.getWidth();
    }
    public int getMissileHeight(){
        return missile.getHeight();
    }
}
