package com.romellfudi.ussd.di.component;

import java.lang.System;

/**
 * @autor Romell Domínguez
 * @date 2020-04-27
 * @version 1.0
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/romellfudi/ussd/di/component/AppComponent;", "", "inject", "", "app", "Lcom/romellfudi/ussd/App;", "Factory", "app-kotlin_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.romellfudi.ussd.di.AppModule.class, com.romellfudi.ussd.di.ActivityFactory.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.romellfudi.ussd.App app);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/romellfudi/ussd/di/component/AppComponent$Factory;", "", "create", "Lcom/romellfudi/ussd/di/component/AppComponent;", "context", "Landroid/app/Application;", "app-kotlin_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.romellfudi.ussd.di.component.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.app.Application context);
    }
}