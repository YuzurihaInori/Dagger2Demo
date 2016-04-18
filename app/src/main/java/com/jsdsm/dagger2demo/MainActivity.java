package com.jsdsm.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInjectButton(View view){
        startActivity(new Intent(this,InjectActivity.class));
    }
    public void onProvidesButton(View view){
        startActivity(new Intent(this,ProvidesActivity.class));
    }
    public void onNamedButton(View view){
        startActivity(new Intent(this,NamedActivity.class));
    }
    public void onSingletonButton(View view){
        startActivity(new Intent(this,SingletonActivity.class));
    }


}
