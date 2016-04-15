package com.jsdsm.dagger2demo;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
* Created by Toast-pc on 2016/4/14.
        */
@Module
public class PersonModule {
    @Singleton
    @Provides Person getPerson(){
        return new Person();
    }
    @Provides Animal getAnimal(){
        return  new Animal();
    }

    @Provides String getName(){
        return "cat";
    }

    @Named("nick")
    @Provides String getNick(){
        return "mimi";
    }

    @Provides @Named("mou") Animal getAnimal2(@Named("nick") String name){
        return new Animal(name);
    }
}
