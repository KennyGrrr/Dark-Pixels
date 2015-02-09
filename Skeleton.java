import greenfoot.*;

/**
 * Write a description of class Skeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skeleton extends Actor
{
    int wait = 1;
    /**
     * Act - do whatever the Skeleton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        randomMovement();
        death();
        //kill will give an error when death occurs
    }    
    public void randomMovement()
    {
        //Poorly executed random movement function
        int i = 0;
        if( Greenfoot.getRandomNumber(50) == 0)
        {
            //up
            setLocation(getX(), getY() - 10);
        }
        if( Greenfoot.getRandomNumber(50) == 1)
        {
            //right
            setLocation(getX() + 20, getY());
        }
        if(Greenfoot.getRandomNumber(50) == 2)
        {
            //down
            setLocation(getX(), getY() + 10);
        }
        if(Greenfoot.getRandomNumber(50) == 3)
        {
            // left
            setLocation(getX() - 10, getY());
        }
    }
    public void death()
    {
        // Death: if the iron sword touches this actor it is removed.
        Actor ironsword;
        ironsword = getOneObjectAtOffset(0, 0, IronSword.class);
        if (isTouching(IronSword.class) == true)
        {
            World world;
            world = getWorld();
            world.removeObject(this);
        }
    }
}
