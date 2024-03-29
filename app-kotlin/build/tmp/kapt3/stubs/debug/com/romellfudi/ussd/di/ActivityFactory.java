package com.romellfudi.ussd.di;

import java.lang.System;

/**
 * @autor Romell Domínguez
 * @date 2020-04-27
 * @version 1.0
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/romellfudi/ussd/di/ActivityFactory;", "", "()V", "bindMainActivity", "Lcom/romellfudi/ussd/accessibility/view/MainActivity;", "app-kotlin_debug"})
@dagger.Module()
public abstract class ActivityFactory {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.romellfudi.ussd.accessibility.MainModule.class, com.romellfudi.ussd.main.MainFragmentProvider.class})
    public abstract com.romellfudi.ussd.accessibility.view.MainActivity bindMainActivity();
    
    public ActivityFactory() {
        super();
    }
}