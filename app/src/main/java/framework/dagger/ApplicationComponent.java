package framework.dagger;


import dagger.Component;
import framework.core.BaseActivity;
import framework.dagger.modules.AppModule;
import framework.dagger.modules.NetworkModule;

@Component(modules = {
        AppModule.class,
        NetworkModule.class
})
public interface ApplicationComponent {
    void inject(BaseActivity activity);
}
