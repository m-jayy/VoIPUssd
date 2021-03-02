// Generated by Dagger (https://dagger.dev).
package com.romellfudi.ussd.accessibility;

import android.content.Context;
import com.google.android.play.core.appupdate.AppUpdateManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainModule_ProvideAppUpdateManager$app_kotlin_debugFactory implements Factory<AppUpdateManager> {
  private final MainModule module;

  private final Provider<Context> contextProvider;

  public MainModule_ProvideAppUpdateManager$app_kotlin_debugFactory(MainModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public AppUpdateManager get() {
    return provideAppUpdateManager$app_kotlin_debug(module, contextProvider.get());
  }

  public static MainModule_ProvideAppUpdateManager$app_kotlin_debugFactory create(MainModule module,
      Provider<Context> contextProvider) {
    return new MainModule_ProvideAppUpdateManager$app_kotlin_debugFactory(module, contextProvider);
  }

  public static AppUpdateManager provideAppUpdateManager$app_kotlin_debug(MainModule instance,
      Context context) {
    return Preconditions.checkNotNull(instance.provideAppUpdateManager$app_kotlin_debug(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
