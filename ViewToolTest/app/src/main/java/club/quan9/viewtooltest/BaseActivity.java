package club.quan9.viewtooltest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by wily on 2018/3/12.
 */

public class BaseActivity extends AppCompatActivity
{
    private static final String TAG="BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(TAG, getClass().getSimpleName());
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy()
    {
        ActivityCollector.removeActivity(this);
    }
}
