package com.jsdsm.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class SingletonActivity extends AppCompatActivity {

    @Inject
    public Snake mSnake1;
    @Inject
    public Snake mSnake2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        SingletonComponent singletonComponent = DaggerSingletonComponent.create();
        singletonComponent.makeSnake(this);

        mSnake1.speak();
        mSnake2.speak();

        if (mSnake1 == mSnake2){
            System.out.println("我们是一条蛇");
        }
    }
}
