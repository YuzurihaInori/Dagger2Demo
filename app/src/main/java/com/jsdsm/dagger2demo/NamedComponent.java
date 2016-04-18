package com.jsdsm.dagger2demo;

import dagger.Component;

/**
 * Created by Toast-pc on 2016/4/18.
 */

@Component(modules = RabbitModule.class)
public interface NamedComponent {
    void makeRabbit(NamedActivity namedActivity);
}
