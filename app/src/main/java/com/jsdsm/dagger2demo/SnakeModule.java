package com.jsdsm.dagger2demo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Toast-pc on 2016/4/18.
 */
@Module
public class SnakeModule {

    @Provides
    @Singleton
    public Snake getSnake(){
        return new Snake();
    }

}
