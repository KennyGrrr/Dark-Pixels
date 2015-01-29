import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IronSword here.
 *
 * @author Dead-Pixel
 * @version (a version number or a date)
 */
public class IronSword extends Actor
{
    int pause = 2;
    int direction;
    /**
     * Act - do whatever the IronSword wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        imageSetter();
        if(pause>0)
        {
           pause--;
        }
        if(pause == 0)
        {
           getWorld().removeObject(this);
        }
    }
    public void imageSetter()
    {
        if(direction == 1)
        {
            setImage("IronSword_U.png");
        }
        if(direction == 3)
        {
            setImage("IronSword_D.png");
        }
        if(direction == 4)
        {
            setImage("IronSword_L.png");
        }
        if(direction == 2)
        {
            setImage("IronSword_R.png");
        }
    }
    public void setDirection(int d)
    {
        direction = d;
    }
}
