package com.romellfudi.ussd.accessibility;

import java.lang.System;

/**
 * @autor Romell Domínguez
 * @date 2020-04-27
 * @version 1.0
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J-\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0010H\u0001\u00a2\u0006\u0002\b\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/romellfudi/ussd/accessibility/MainModule;", "", "()V", "provideAppUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "context", "Landroid/content/Context;", "provideAppUpdateManager$app_kotlin_debug", "provideMainInteractor", "Lcom/romellfudi/ussd/accessibility/interactor/MainMVPInteractor;", "mainInteractor", "Lcom/romellfudi/ussd/accessibility/interactor/MainInteractor;", "provideMainPresenter", "Lcom/romellfudi/ussd/accessibility/presenter/MainMVPPresenter;", "Lcom/romellfudi/ussd/accessibility/view/MainMVPView;", "mainPresenter", "Lcom/romellfudi/ussd/accessibility/presenter/MainPresenter;", "provideMainPresenter$app_kotlin_debug", "app-kotlin_debug"})
@dagger.Module()
public final class MainModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.android.play.core.appupdate.AppUpdateManager provideAppUpdateManager$app_kotlin_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.romellfudi.ussd.accessibility.interactor.MainMVPInteractor provideMainInteractor(@org.jetbrains.annotations.NotNull()
    com.romellfudi.ussd.accessibility.interactor.MainInteractor mainInteractor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.romellfudi.ussd.accessibility.presenter.MainMVPPresenter<com.romellfudi.ussd.accessibility.view.MainMVPView, com.romellfudi.ussd.accessibility.interactor.MainMVPInteractor> provideMainPresenter$app_kotlin_debug(@org.jetbrains.annotations.NotNull()
    com.romellfudi.ussd.accessibility.presenter.MainPresenter<com.romellfudi.ussd.accessibility.view.MainMVPView, com.romellfudi.ussd.accessibility.interactor.MainMVPInteractor> mainPresenter) {
        return null;
    }
    
    public MainModule() {
        super();
    }
}