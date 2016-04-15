package com.jsdsm.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;
import javax.inject.Named;


public class MainActivity extends AppCompatActivity {

    @Inject
    public Person mPerson;
    @Inject
    public Person mPerson1;
    @Named("mou")
    @Inject
    public Animal mAnimal;
    @Inject
    public Animal mAnimal1;
    public String name;


//    @Inject
//    public String name = "cat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PersonComponent personComponent = DaggerPersonComponent.create();
        personComponent.inject(this);

        System.out.println("person address "+mPerson);
        System.out.println("person1 address "+mPerson1);
        System.out.println("\n");
        System.out.println("mAnimal address "+mAnimal);
        System.out.println("mAnimal1 address "+mAnimal1);

        mPerson.sleep();
//        mAnimal.speak();
        mAnimal.mouSpeak();

    }
}
