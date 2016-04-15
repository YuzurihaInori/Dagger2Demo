package com.jsdsm.dagger2demo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Toast-pc on 2016/4/14.
 */

@Singleton
@Component(modules = PersonModule.class)
public interface PersonComponent {
    void inject(MainActivity mainActivity);


}
