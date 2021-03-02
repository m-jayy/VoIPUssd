package com.romellfudi.ussd.main.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&\u00a8\u0006\r"}, d2 = {"Lcom/romellfudi/ussd/main/presenter/MainFragmentMVPPresenter;", "V", "Lcom/romellfudi/ussd/main/view/MainFragmentMVPView;", "I", "Lcom/romellfudi/ussd/main/interactor/MainFragmentMVPInteractor;", "", "attachObserves", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "call", "callOverlay", "callSplashOverlay", "app-kotlin_debug"})
public abstract interface MainFragmentMVPPresenter<V extends com.romellfudi.ussd.main.view.MainFragmentMVPView, I extends com.romellfudi.ussd.main.interactor.MainFragmentMVPInteractor> {
    
    public abstract void attachObserves(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner);
    
    public abstract void call();
    
    public abstract void callOverlay();
    
    public abstract void callSplashOverlay();
}