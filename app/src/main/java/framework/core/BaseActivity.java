package framework.core;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        this.initDagger();
    }

    private void initDagger() {
        ((AppApplicationComponent) getApplication()).getApplicationComponent().inject(this);
    }

    public abstract int getContentViewId();

}

