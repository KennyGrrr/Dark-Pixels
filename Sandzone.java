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
        skeleton.setLocation(100, 81);
        Skeleton skeleton2 = new Skeleton();
        addObject(skeleton2, 524, 90);
        Skeleton skeleton3 = new Skeleton();
        addObject(skeleton3, 523, 318);
        Skeleton skeleton4 = new Skeleton();
        addObject(skeleton4, 103, 320);
        Skeleton skeleton5 = new Skeleton();
        addObject(skeleton5, 319, 57);
        Skeleton skeleton6 = new Skeleton();
        addObject(skeleton6, 49, 207);
        Skeleton skeleton7 = new Skeleton();
        addObject(skeleton7, 590, 207);
        Skeleton skeleton8 = new Skeleton();
        addObject(skeleton8, 316, 361);
        Skeleton skeleton9 = new Skeleton();
        addObject(skeleton9, 209, 45);
        Skeleton skeleton10 = new Skeleton();
        addObject(skeleton10, 441, 40);
        Skeleton skeleton11 = new Skeleton();
        addObject(skeleton11, 203, 358);
        Skeleton skeleton12 = new Skeleton();
        addObject(skeleton12, 445, 365);
        Skeleton skeleton13 = new Skeleton();
        addObject(skeleton13, 57, 120);
        Skeleton skeleton14 = new Skeleton();
        addObject(skeleton14, 63, 319);
        Skeleton skeleton15 = new Skeleton();
        addObject(skeleton15, 158, 364);
        Skeleton skeleton16 = new Skeleton();
        addObject(skeleton16, 280, 385);
        Skeleton skeleton17 = new Skeleton();
        addObject(skeleton17, 398, 397);
        Skeleton skeleton18 = new Skeleton();
        addObject(skeleton18, 570, 382);
        Skeleton skeleton19 = new Skeleton();
        addObject(skeleton19, 584, 307);
        Skeleton skeleton20 = new Skeleton();
        addObject(skeleton20, 572, 82);
        Skeleton skeleton21 = new Skeleton();
        addObject(skeleton21, 506, 51);
        Skeleton skeleton22 = new Skeleton();
        addObject(skeleton22, 410, 42);
        Skeleton skeleton23 = new Skeleton();
        addObject(skeleton23, 359, 25);
        Skeleton skeleton24 = new Skeleton();
        addObject(skeleton24, 278, 8);
        Skeleton skeleton25 = new Skeleton();
        addObject(skeleton25, 156, 23);
        Skeleton skeleton26 = new Skeleton();
        addObject(skeleton26, 243, 16);
        character.setLocation(312, 199);
    }
}
