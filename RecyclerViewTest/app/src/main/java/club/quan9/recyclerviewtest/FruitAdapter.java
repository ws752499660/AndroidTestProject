package club.quan9.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wily on 2018/3/20.
 */

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder>
{
    private List<Fruit> mFruitList;

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView fruitImage;
        TextView fruitName;

        public ViewHolder(View view)
        {
            super(view);
            fruitImage=(ImageView) view.findViewById(R.id.imageview);
            fruitName=(TextView) view.findViewById(R.id.textview);
        }
    }

    public FruitAdapter(List<Fruit> fruitList)
    {
        mFruitList=fruitList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position, List<Object> payloads)
    {
        Fruit fruit=mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    @Override
    public int getItemCount()
    {
        return mFruitList.size();
    }
}
