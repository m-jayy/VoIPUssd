package com.romellfudi.ussd.main;

import java.lang.System;

/**
 * Created by jyotidubey on 15/01/18.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/romellfudi/ussd/main/MainFragmentProvider;", "", "()V", "provideMainFragmentView", "Lcom/romellfudi/ussd/main/view/MainFragmentView;", "provideMainFragmentView$app_kotlin_debug", "app-kotlin_debug"})
@dagger.Module()
public abstract class MainFragmentProvider {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.romellfudi.ussd.main.MainFragmentModule.class})
    public abstract com.romellfudi.ussd.main.view.MainFragmentView provideMainFragmentView$app_kotlin_debug();
    
    public MainFragmentProvider() {
        super();
    }
}