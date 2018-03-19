package club.quan9.uicustonviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by wily on 2018/3/17.
 */

public class TittleLayout extends LinearLayout
{
    public TittleLayout(final Context context, AttributeSet attrs)
    {
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button tittleBack=(Button) findViewById(R.id.tittle_back);
        Button tittleEdit=(Button) findViewById(R.id.tittle_edit);
        tittleBack.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ((Activity)getContext()).finish();
            }
        });
        tittleEdit.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context,"You clicked Edit button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
