package framework.core;


import android.app.Application;

import framework.dagger.ApplicationComponent;
import framework.dagger.DaggerApplicationComponent;
import framework.dagger.modules.AppModule;
import framework.dagger.modules.NetworkModule;

public class AppApplicationComponent extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initDagger();
    }

    private void initDagger() {
        applicationComponent = DaggerApplicationComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
