package club.quan9.viewtooltest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends BaseActivity
{

    private static final String TAG="Main2Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "Task id is "+getTaskId());
        Button buttoncnm2=(Button) findViewById(R.id.buttoncnm2);
        Button buttoncnm2_2=(Button) findViewById(R.id.buttoncnm2_2);
        buttoncnm2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent("club.quan9.viewtooltest.Main3");
                intent.addCategory("android.intent.category.DEFAULT");
                startActivity(intent);
            }
        });
        buttoncnm2_2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
