package club.quan9.listviewtest;

/**
 * Created by wily on 2018/3/19.
 */

public class Fruit
{
    private String name;

    private int imageId;

    public Fruit(String name,int imageid)
    {
        this.name=name;
        this.imageId=imageid;
    }

    public String getName()
    {
        return name;
    }

    public int getImageId()
    {
        return imageId;
    }
}
