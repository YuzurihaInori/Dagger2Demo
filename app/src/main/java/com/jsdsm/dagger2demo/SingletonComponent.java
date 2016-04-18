package com.jsdsm.dagger2demo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Toast-pc on 2016/4/18.
 */
@Singleton
@Component(modules = SnakeModule.class)
public interface SingletonComponent {
    void makeSnake(SingletonActivity singletonActivity);
}
