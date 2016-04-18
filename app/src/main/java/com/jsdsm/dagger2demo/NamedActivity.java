package com.jsdsm.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Named;

public class NamedActivity extends AppCompatActivity {

    @Named("colorRabbit")
    @Inject
    Rabbit mColorRabbit;

    @Inject
    Rabbit mRabbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_named);

        NamedComponent namedComponent = DaggerNamedComponent.create();
        namedComponent.makeRabbit(this);

        mRabbit.speak();
        mColorRabbit.speak();
    }
}
