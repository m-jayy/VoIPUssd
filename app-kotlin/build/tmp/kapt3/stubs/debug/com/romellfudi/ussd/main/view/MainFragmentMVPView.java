package com.romellfudi.ussd.main.view;

import java.lang.System;

/**
 * @version 1.0
 * @autor Romell Domínguez
 * @date 2020-04-26
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\rH&J\b\u0010\u0014\u001a\u00020\u0011H&J\b\u0010\u0015\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/romellfudi/ussd/main/view/MainFragmentMVPView;", "", "hasAllowOverlay", "", "getHasAllowOverlay", "()Z", "ussdApi", "Lcom/romellfudi/ussdlibrary/USSDApi;", "getUssdApi", "()Lcom/romellfudi/ussdlibrary/USSDApi;", "setUssdApi", "(Lcom/romellfudi/ussdlibrary/USSDApi;)V", "ussdNumber", "", "getUssdNumber", "()Ljava/lang/String;", "dismissOverlay", "", "setResult", "data", "showOverlay", "showSplashOverlay", "app-kotlin_debug"})
public abstract interface MainFragmentMVPView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUssdNumber();
    
    public abstract void setResult(@org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.romellfudi.ussdlibrary.USSDApi getUssdApi();
    
    public abstract void setUssdApi(@org.jetbrains.annotations.NotNull()
    com.romellfudi.ussdlibrary.USSDApi p0);
    
    public abstract boolean getHasAllowOverlay();
    
    public abstract void showOverlay();
    
    public abstract void showSplashOverlay();
    
    public abstract void dismissOverlay();
}