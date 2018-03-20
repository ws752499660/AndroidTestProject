package club.quan9.recyclerviewtest;

/**
 * Created by wily on 2018/3/19.
 */

public class Fruit
{
    private String Name;
    private int ImageId;
    public Fruit(String Name,int ImageId)
    {
        this.Name=Name;
        this.ImageId=ImageId;
    }

    public int getImageId()
    {
        return ImageId;
    }

    public String getName()
    {
        return Name;
    }
}
