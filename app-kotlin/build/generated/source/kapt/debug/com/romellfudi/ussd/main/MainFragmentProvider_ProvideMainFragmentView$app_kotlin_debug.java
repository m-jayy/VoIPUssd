package com.romellfudi.ussd.main;

import com.romellfudi.ussd.main.view.MainFragmentView;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      MainFragmentProvider_ProvideMainFragmentView$app_kotlin_debug.MainFragmentViewSubcomponent
          .class
)
public abstract class MainFragmentProvider_ProvideMainFragmentView$app_kotlin_debug {
  private MainFragmentProvider_ProvideMainFragmentView$app_kotlin_debug() {}

  @Binds
  @IntoMap
  @ClassKey(MainFragmentView.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainFragmentViewSubcomponent.Factory builder);

  @Subcomponent(modules = MainFragmentModule.class)
  public interface MainFragmentViewSubcomponent extends AndroidInjector<MainFragmentView> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainFragmentView> {}
  }
}
