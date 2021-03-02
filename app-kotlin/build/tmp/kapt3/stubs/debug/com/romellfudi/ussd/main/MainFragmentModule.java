package com.romellfudi.ussd.main;

import java.lang.System;

/**
 * @version 1.0
 * @autor Romell Domínguez
 * @date 2020-04-22
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J-\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\fH\u0001\u00a2\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0010H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/romellfudi/ussd/main/MainFragmentModule;", "", "()V", "provideMainFragmentInteractor", "Lcom/romellfudi/ussd/main/interactor/MainFragmentMVPInteractor;", "interactor", "Lcom/romellfudi/ussd/main/interactor/MainFragmentInteractor;", "provideMainFragmentInteractor$app_kotlin_debug", "provideMainFragmentPresenter", "Lcom/romellfudi/ussd/main/presenter/MainFragmentMVPPresenter;", "Lcom/romellfudi/ussd/main/view/MainFragmentMVPView;", "presenter", "Lcom/romellfudi/ussd/main/presenter/MainFragmentPresenter;", "provideMainFragmentPresenter$app_kotlin_debug", "provideMainFragmentView", "view", "Lcom/romellfudi/ussd/main/view/MainFragmentView;", "provideMainFragmentView$app_kotlin_debug", "providePermissionService", "Lcom/romellfudi/permission/PermissionService;", "fragment", "provideUSSDApi", "Lcom/romellfudi/ussdlibrary/USSDApi;", "app-kotlin_debug"})
@dagger.Module()
public final class MainFragmentModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.romellfudi.permission.PermissionService providePermissionService(@org.jetbrains.annotations.NotNull()
    com.romellfudi.ussd.main.view.MainFragmentView fragment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.romellfudi.ussdlibrary.USSDApi provideUSSDApi(@org.jetbrains.annotations.NotNull()
    com.romellfudi.ussd.main.view.MainFragmentView fragment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.romellfudi.ussd.main.view.MainFragmentMVPView provideMainFragmentView$app_kotlin_debug(@org.jetbrains.annotations.NotNull()
    com.romellfudi.ussd.main.view.MainFragmentView view) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.romellfudi.ussd.main.interactor.MainFragmentMVPInteractor provideMainFragmentInteractor$app_kotlin_debug(@org.jetbrains.annotations.NotNull()
    com.romellfudi.ussd.main.interactor.MainFragmentInteractor interactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.romellfudi.ussd.main.presenter.MainFragmentMVPPresenter<com.romellfudi.ussd.main.view.MainFragmentMVPView, com.romellfudi.ussd.main.interactor.MainFragmentMVPInteractor> provideMainFragmentPresenter$app_kotlin_debug(@org.jetbrains.annotations.NotNull()
    com.romellfudi.ussd.main.presenter.MainFragmentPresenter<com.romellfudi.ussd.main.view.MainFragmentMVPView, com.romellfudi.ussd.main.interactor.MainFragmentMVPInteractor> presenter) {
        return null;
    }
    
    public MainFragmentModule() {
        super();
    }
}