// Generated by Dagger (https://dagger.dev).
package com.romellfudi.ussd.main.presenter;

import com.romellfudi.ussd.main.interactor.MainFragmentMVPInteractor;
import com.romellfudi.ussd.main.view.MainFragmentMVPView;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainFragmentPresenter_Factory<V extends MainFragmentMVPView, I extends MainFragmentMVPInteractor> implements Factory<MainFragmentPresenter<V, I>> {
  private final Provider<V> viewProvider;

  private final Provider<I> interatorProvider;

  public MainFragmentPresenter_Factory(Provider<V> viewProvider, Provider<I> interatorProvider) {
    this.viewProvider = viewProvider;
    this.interatorProvider = interatorProvider;
  }

  @Override
  public MainFragmentPresenter<V, I> get() {
    return new MainFragmentPresenter<V, I>(viewProvider.get(), interatorProvider.get());
  }

  public static <V extends MainFragmentMVPView, I extends MainFragmentMVPInteractor> MainFragmentPresenter_Factory<V, I> create(
      Provider<V> viewProvider, Provider<I> interatorProvider) {
    return new MainFragmentPresenter_Factory<V, I>(viewProvider, interatorProvider);
  }

  public static <V extends MainFragmentMVPView, I extends MainFragmentMVPInteractor> MainFragmentPresenter<V, I> newInstance(
      V view, I interator) {
    return new MainFragmentPresenter<V, I>(view, interator);
  }
}
