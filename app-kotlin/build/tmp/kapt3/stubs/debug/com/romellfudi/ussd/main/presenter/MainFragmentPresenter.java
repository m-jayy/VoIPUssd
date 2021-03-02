package com.romellfudi.ussd.main.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u001b\b\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00018\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/romellfudi/ussd/main/presenter/MainFragmentPresenter;", "V", "Lcom/romellfudi/ussd/main/view/MainFragmentMVPView;", "I", "Lcom/romellfudi/ussd/main/interactor/MainFragmentMVPInteractor;", "Lcom/romellfudi/ussd/main/presenter/MainFragmentMVPPresenter;", "view", "interator", "(Lcom/romellfudi/ussd/main/view/MainFragmentMVPView;Lcom/romellfudi/ussd/main/interactor/MainFragmentMVPInteractor;)V", "getInterator", "()Lcom/romellfudi/ussd/main/interactor/MainFragmentMVPInteractor;", "setInterator", "(Lcom/romellfudi/ussd/main/interactor/MainFragmentMVPInteractor;)V", "Lcom/romellfudi/ussd/main/interactor/MainFragmentMVPInteractor;", "getView", "()Lcom/romellfudi/ussd/main/view/MainFragmentMVPView;", "setView", "(Lcom/romellfudi/ussd/main/view/MainFragmentMVPView;)V", "Lcom/romellfudi/ussd/main/view/MainFragmentMVPView;", "attachObserves", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "call", "callOverlay", "callSplashOverlay", "app-kotlin_debug"})
public final class MainFragmentPresenter<V extends com.romellfudi.ussd.main.view.MainFragmentMVPView, I extends com.romellfudi.ussd.main.interactor.MainFragmentMVPInteractor> implements com.romellfudi.ussd.main.presenter.MainFragmentMVPPresenter<V, I> {
    @org.jetbrains.annotations.Nullable()
    private V view;
    @org.jetbrains.annotations.Nullable()
    private I interator;
    
    @java.lang.Override()
    public void attachObserves(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
    }
    
    @java.lang.Override()
    public void call() {
    }
    
    @java.lang.Override()
    public void callOverlay() {
    }
    
    @java.lang.Override()
    public void callSplashOverlay() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final V getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    V p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final I getInterator() {
        return null;
    }
    
    public final void setInterator(@org.jetbrains.annotations.Nullable()
    I p0) {
    }
    
    @javax.inject.Inject()
    public MainFragmentPresenter(@org.jetbrains.annotations.Nullable()
    V view, @org.jetbrains.annotations.Nullable()
    I interator) {
        super();
    }
}