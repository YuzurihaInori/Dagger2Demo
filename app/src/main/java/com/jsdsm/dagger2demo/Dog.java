package com.jsdsm.dagger2demo;

import javax.inject.Inject;

/**
 * Created by Toast-pc on 2016/4/18.
 */
public class Dog {

    @Inject
    public Dog() {
    }

    public void speak(){
        System.out.println("汪！！！");
    }
}
