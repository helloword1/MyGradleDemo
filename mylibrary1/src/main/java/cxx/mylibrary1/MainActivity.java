package cxx.mylibrary1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String BaseUrl=BuildConfig.BaseUrl;
        String appName=getString(R.string.AppName);
    }
}
