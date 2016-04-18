package com.jsdsm.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class ProvidesActivity extends AppCompatActivity {

    @Inject
    public Cat mCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provides);

        ProvidesComponent providesComponent = DaggerProvidesComponent.create();
        providesComponent.makeCat(this);

        mCat.speak();

    }
}
