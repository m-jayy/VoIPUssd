package com.romellfudi.ussd.main.view;

import java.lang.System;

/**
 * Use Case for Test Windows
 *
 * @author Romell Domínguez
 * @version 1.1.b 27/09/2018
 * @since 1.0.a
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J+\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020 022\u0006\u00103\u001a\u000204H\u0016\u00a2\u0006\u0002\u00105J\u001a\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020 H\u0016J\b\u0010:\u001a\u00020$H\u0016J\b\u0010;\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR*\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"\u00a8\u0006<"}, d2 = {"Lcom/romellfudi/ussd/main/view/MainFragmentView;", "Landroidx/fragment/app/Fragment;", "Lcom/romellfudi/ussd/main/view/MainFragmentMVPView;", "()V", "callback", "Lcom/romellfudi/permission/PermissionService$Callback;", "hasAllowOverlay", "", "getHasAllowOverlay", "()Z", "mainFragmentMVPPresenter", "Lcom/romellfudi/ussd/main/presenter/MainFragmentMVPPresenter;", "Lcom/romellfudi/ussd/main/interactor/MainFragmentMVPInteractor;", "getMainFragmentMVPPresenter", "()Lcom/romellfudi/ussd/main/presenter/MainFragmentMVPPresenter;", "setMainFragmentMVPPresenter", "(Lcom/romellfudi/ussd/main/presenter/MainFragmentMVPPresenter;)V", "overlay", "Landroid/content/Intent;", "permissionService", "Lcom/romellfudi/permission/PermissionService;", "getPermissionService", "()Lcom/romellfudi/permission/PermissionService;", "setPermissionService", "(Lcom/romellfudi/permission/PermissionService;)V", "ussdApi", "Lcom/romellfudi/ussdlibrary/USSDApi;", "getUssdApi", "()Lcom/romellfudi/ussdlibrary/USSDApi;", "setUssdApi", "(Lcom/romellfudi/ussdlibrary/USSDApi;)V", "ussdNumber", "", "getUssdNumber", "()Ljava/lang/String;", "dismissOverlay", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "setResult", "data", "showOverlay", "showSplashOverlay", "app-kotlin_debug"})
public final class MainFragmentView extends androidx.fragment.app.Fragment implements com.romellfudi.ussd.main.view.MainFragmentMVPView {
    private android.content.Intent overlay;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.romellfudi.ussdlibrary.USSDApi ussdApi;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.romellfudi.permission.PermissionService permissionService;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.romellfudi.ussd.main.presenter.MainFragmentMVPPresenter<com.romellfudi.ussd.main.view.MainFragmentMVPView, com.romellfudi.ussd.main.interactor.MainFragmentMVPInteractor> mainFragmentMVPPresenter;
    private final com.romellfudi.permission.PermissionService.Callback callback = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUssdNumber() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getHasAllowOverlay() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.romellfudi.ussdlibrary.USSDApi getUssdApi() {
        return null;
    }
    
    @java.lang.Override()
    public void setUssdApi(@org.jetbrains.annotations.NotNull()
    com.romellfudi.ussdlibrary.USSDApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.romellfudi.permission.PermissionService getPermissionService() {
        return null;
    }
    
    public final void setPermissionService(@org.jetbrains.annotations.NotNull()
    com.romellfudi.permission.PermissionService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.romellfudi.ussd.main.presenter.MainFragmentMVPPresenter<com.romellfudi.ussd.main.view.MainFragmentMVPView, com.romellfudi.ussd.main.interactor.MainFragmentMVPInteractor> getMainFragmentMVPPresenter() {
        return null;
    }
    
    public final void setMainFragmentMVPPresenter(@org.jetbrains.annotations.NotNull()
    com.romellfudi.ussd.main.presenter.MainFragmentMVPPresenter<com.romellfudi.ussd.main.view.MainFragmentMVPView, com.romellfudi.ussd.main.interactor.MainFragmentMVPInteractor> p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setResult(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    @java.lang.Override()
    public void showOverlay() {
    }
    
    @java.lang.Override()
    public void showSplashOverlay() {
    }
    
    @java.lang.Override()
    public void dismissOverlay() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public MainFragmentView() {
        super();
    }
}