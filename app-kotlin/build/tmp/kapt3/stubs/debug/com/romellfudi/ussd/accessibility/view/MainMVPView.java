package com.romellfudi.ussd.accessibility.view;

import java.lang.System;

/**
 * @version 1.0
 * @autor Romell Domínguez
 * @date 2020-04-26
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/romellfudi/ussd/accessibility/view/MainMVPView;", "", "checkUpdate", "", "notifyUser", "showMessage", "message", "", "app-kotlin_debug"})
public abstract interface MainMVPView {
    
    public abstract void checkUpdate();
    
    public abstract void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void notifyUser();
}