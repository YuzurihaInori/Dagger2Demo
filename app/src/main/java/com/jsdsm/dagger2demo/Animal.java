package com.jsdsm.dagger2demo;

/**
 * Created by Toast-pc on 2016/4/15.
 */
public class Animal {

    private String mName;

    public Animal() {
    }
    public Animal(String name){
        this.mName = name;
    }
    public void speak(){
        System.out.println("mie~~~mie~~~mie`~~~");
    }

    public void mouSpeak(){
        System.out.println(mName+"  mie~~~mie~~~mie`~~~");
    }
}
