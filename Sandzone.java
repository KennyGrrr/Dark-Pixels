import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sandzone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sandzone extends World
{

    /**
     * Constructor for objects of class Sandzone.
     * 
     */
    public Sandzone()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        prepare();
    }
    

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Character character = new Character();
        addObject(character, 276, 217);
        Skeleton skeleton = new Skeleton();
        addObject(skeleton, 95, 204);
        character.setLocation(505, 225);
        skeleton.setLocation(302, 197);
        character.setLocation(512, 217);
    }
}
