package com.jsdsm.dagger2demo;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Toast-pc on 2016/4/18.
 */
@Module
public class RabbitModule {

    @Named("weight")
    @Provides
    public String getWeight(){
        return "10kg";
    }

    @Named("color")
    @Provides
    public String getColor(){
        return "黑色";
    }

    @Named("colorRabbit")
    @Provides
    public Rabbit getColorRabbit(@Named("color") String color){
        return new Rabbit(color);
    }
    @Provides
    public Rabbit getRabbit(){
        return new Rabbit();
    }
}
