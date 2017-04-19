package framework.dagger.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import constants.AppConstants;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Application mApplication;
    SharedPreferences mSharedPrefs;

    public AppModule(Application application) {
        this.mApplication = application;
        this.mSharedPrefs = this.mApplication.getSharedPreferences(AppConstants.SHARED_PREFS_KEY, Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    Context providesContext() {
        return this.mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return this.mApplication;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences() {
        return this.mSharedPrefs;
    }
}
