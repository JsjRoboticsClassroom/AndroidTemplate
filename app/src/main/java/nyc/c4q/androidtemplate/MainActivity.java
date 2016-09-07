package nyc.c4q.androidtemplate;

import android.app.Activity;
import android.os.Bundle;

import com.jsjrobotics.defaultTemplate.lifecycle.DefaultLifecycleActivity;

public class MainActivity extends DefaultLifecycleActivity {
    @Override
    public void onCreateNoView (Activity activity){
        activity.setContentView(R.layout.main_activity);
    }

    @Override
    public void onCreateViewExists (Activity activity, Bundle savedInstanceState){
        activity.setContentView(R.layout.main_activity);
    }
}
