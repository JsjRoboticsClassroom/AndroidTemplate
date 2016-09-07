package nyc.c4q.androidtemplate;

import com.jsjrobotics.defaultTemplate.lifecycle.wrappers.LifecycleActivity;
import com.jsjrobotics.defaultTemplate.lifecycle.wrappers.interfaces.ILifecycleActivity;

public class MainActivityWrapper extends LifecycleActivity {
    private ILifecycleActivity mActivity = new MainActivity();

    @Override
    protected ILifecycleActivity getLifecycleActivity() {
        return mActivity;
    }
}
