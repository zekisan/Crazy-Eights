package com.example.ezequiel.crazyeights;

import android.graphics.Bitmap;

/**
 * Created by ezequiel on 04/04/15.
 */
public class Card {

    private int id;
    private Bitmap bmp;
    private int rank;
    private int suit;
    private int scoreValue = 0;

    public Card(int newId){
        id = newId;
        suit = Math.round((id/100)*100);
        rank = id - suit;
        if (rank == 8){
            scoreValue = 50;
        }else if(rank == 14){
            scoreValue = 1;
        }else if(rank > 9 && rank < 14){
            scoreValue = 10;
        }else{
            scoreValue = rank;
        }
    }

    public void setBitmap(Bitmap newBitmap){
        bmp = newBitmap;
    }

    public Bitmap getBitmap(){
        return bmp;
    }

    public int getId(){
        return id;
    }

    public int getSuit(){
        return suit;
    }

    public int getRank(){
        return rank;
    }

    public int getScoreValue(){
        return scoreValue;
    }
}
