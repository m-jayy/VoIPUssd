// Generated by Dagger (https://dagger.dev).
package com.romellfudi.ussd.main.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainFragmentInteractor_Factory implements Factory<MainFragmentInteractor> {
  private final Provider<Context> mContextProvider;

  public MainFragmentInteractor_Factory(Provider<Context> mContextProvider) {
    this.mContextProvider = mContextProvider;
  }

  @Override
  public MainFragmentInteractor get() {
    return new MainFragmentInteractor(mContextProvider.get());
  }

  public static MainFragmentInteractor_Factory create(Provider<Context> mContextProvider) {
    return new MainFragmentInteractor_Factory(mContextProvider);
  }

  public static MainFragmentInteractor newInstance(Context mContext) {
    return new MainFragmentInteractor(mContext);
  }
}
