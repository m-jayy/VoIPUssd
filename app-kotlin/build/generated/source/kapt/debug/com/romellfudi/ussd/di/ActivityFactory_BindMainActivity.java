package com.romellfudi.ussd.di;

import com.romellfudi.ussd.accessibility.MainModule;
import com.romellfudi.ussd.accessibility.view.MainActivity;
import com.romellfudi.ussd.main.MainFragmentProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityFactory_BindMainActivity.MainActivitySubcomponent.class)
public abstract class ActivityFactory_BindMainActivity {
  private ActivityFactory_BindMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(modules = {MainModule.class, MainFragmentProvider.class})
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
