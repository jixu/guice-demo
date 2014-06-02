package com.yahoo.slingstone.demo;

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String helloWorld(String greeting) {
        return "Hello World, " + greeting;
    }
}
