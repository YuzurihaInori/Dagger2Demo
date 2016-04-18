package com.jsdsm.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class InjectActivity extends AppCompatActivity {

    @Inject
    public Dog mDog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inject);

        InjectComponent injectComponent = DaggerInjectComponent.create();

        injectComponent.makeDog(this);

        mDog.speak();

    }
}
