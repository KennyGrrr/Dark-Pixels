import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    int direction;
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        movement();
        stab();
    }    
    public void movement()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 4);
            setImage("IronArmor_U_N.png");
            direction = 1;
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 4);
            setImage("IronArmor_D_N.png");
            direction = 3;
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 4, getY());
            setImage("IronArmor_L_N.png");
            direction = 4;
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 4, getY());
            setImage("IronArmor_R_N.png");
            direction = 2;
        }
    }
    public void stab()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(direction == 1)
            {
                IronSword ironsword = new IronSword();
                ironsword.setDirection(1);
                getWorld().addObject(ironsword, getX() + 1, getY() + 20);
            }
            else if(direction == 2)
            {
                IronSword ironsword = new IronSword();
                ironsword.setDirection(2);
                getWorld().addObject(ironsword, getX() + 1, getY() + 20);
            }
            else if(direction == 3)
            {
                IronSword ironsword = new IronSword();
                ironsword.setDirection(3);
                getWorld().addObject(ironsword, getX() + 1, getY() + 20);
            }
            else if(direction == 4)
            {
                IronSword ironsword = new IronSword();
                ironsword.setDirection(4);
                getWorld().addObject(ironsword, getX() + 1, getY() + 20);
            }
        }
    }
}
