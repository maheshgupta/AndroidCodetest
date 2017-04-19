package framework.core;


import android.app.Application;

import framework.dagger.ApplicationComponent;

public class AppApplicationComponent extends Application {

    private ApplicationComponent applicationComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        this.initDagger();
    }


    private void initDagger() {
    }

}
