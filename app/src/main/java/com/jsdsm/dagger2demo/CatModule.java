package com.jsdsm.dagger2demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Toast-pc on 2016/4/18.
 */
@Module
public class CatModule {
    @Provides
    public Cat getCat(){
        return new Cat();
    }
}
