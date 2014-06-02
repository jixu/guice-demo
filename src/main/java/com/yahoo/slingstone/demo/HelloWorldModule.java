package com.yahoo.slingstone.demo;

import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.Scopes;

public class HelloWorldModule extends AbstractModule implements Module {
    public HelloWorldModule() {}

    @Override
    protected void configure() {
        bind(HelloWorldService.class).to(HelloWorldServiceImpl.class).in(Scopes.SINGLETON);
    }
}
