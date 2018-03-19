package club.quan9.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloWorldActivity extends AppCompatActivity
{
    private static final String TAG = "HelloWorldActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Integer a=0;
        for(int i=0;i<2;i++)
            a++;
        Log.d("data",a.toString());
    }
}
