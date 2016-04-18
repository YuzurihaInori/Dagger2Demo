package com.jsdsm.dagger2demo;

/**
 * Created by Toast-pc on 2016/4/18.
 */
public class Rabbit {

    private String mColor;

    public Rabbit() {
    }

    public Rabbit(String color) {
        mColor = color;
    }

    public void speak(){
        final String speakStr;

        if (mColor != null){
            speakStr = mColor+"兔子怎么叫？";
        }else {
            speakStr = "兔子怎么叫？";
        }
        System.out.println(speakStr);
    }
}
