package com.romellfudi.ussd.accessibility.presenter;

import java.lang.System;

/**
 * @autor Romell Domínguez
 * @date 2020-04-26
 * @version 1.0
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0011\b\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/romellfudi/ussd/accessibility/presenter/MainPresenter;", "V", "Lcom/romellfudi/ussd/accessibility/view/MainMVPView;", "I", "Lcom/romellfudi/ussd/accessibility/interactor/MainMVPInteractor;", "Lcom/romellfudi/ussd/accessibility/presenter/MainMVPPresenter;", "interator", "(Lcom/romellfudi/ussd/accessibility/interactor/MainMVPInteractor;)V", "getInterator", "()Lcom/romellfudi/ussd/accessibility/interactor/MainMVPInteractor;", "setInterator", "Lcom/romellfudi/ussd/accessibility/interactor/MainMVPInteractor;", "app-kotlin_debug"})
public final class MainPresenter<V extends com.romellfudi.ussd.accessibility.view.MainMVPView, I extends com.romellfudi.ussd.accessibility.interactor.MainMVPInteractor> implements com.romellfudi.ussd.accessibility.presenter.MainMVPPresenter<V, I> {
    @org.jetbrains.annotations.Nullable()
    private I interator;
    
    @org.jetbrains.annotations.Nullable()
    public final I getInterator() {
        return null;
    }
    
    public final void setInterator(@org.jetbrains.annotations.Nullable()
    I p0) {
    }
    
    @javax.inject.Inject()
    public MainPresenter(@org.jetbrains.annotations.Nullable()
    I interator) {
        super();
    }
}