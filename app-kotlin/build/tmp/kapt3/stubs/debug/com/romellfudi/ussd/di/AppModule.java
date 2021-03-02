package com.romellfudi.ussd.di;

import java.lang.System;

/**
 * @autor Romell Domínguez
 * @date 2020-04-27
 * @version 1.0
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/romellfudi/ussd/di/AppModule;", "", "()V", "provideContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideContext$app_kotlin_debug", "app-kotlin_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext$app_kotlin_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}