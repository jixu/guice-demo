package com.yahoo.slingstone.demo;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

public class HelloWorldGuice {

    private HelloWorldService service;

    @Inject
    public HelloWorldGuice(HelloWorldService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        Module module = new HelloWorldModule();
        Injector injector = Guice.createInjector(module);
        HelloWorldGuice hello = injector.getInstance(HelloWorldGuice.class);

        System.out.println(hello.service.helloWorld("guice"));
    }
}
