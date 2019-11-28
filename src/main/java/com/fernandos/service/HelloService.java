package com.fernandos.service;

import javax.inject.Singleton;

@Singleton
public class HelloService {


    public String getName(String name) {
        return "hello " + name;
    }

}
