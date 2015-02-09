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
        SkeletonKing skeletonking = new SkeletonKing();
        addObject(skeletonking, 121, 204);
        skeletonking.setLocation(136, 204);
        removeObject(skeletonking);
        Skeleton skeleton27 = new Skeleton();
        addObject(skeleton27, 72, 264);
        Skeleton skeleton28 = new Skeleton();
        addObject(skeleton28, 86, 151);
        Skeleton skeleton29 = new Skeleton();
        addObject(skeleton29, 162, 77);
        Skeleton skeleton30 = new Skeleton();
        addObject(skeleton30, 495, 90);
        Skeleton skeleton31 = new Skeleton();
        addObject(skeleton31, 574, 166);
        Skeleton skeleton32 = new Skeleton();
        addObject(skeleton32, 561, 135);
        Skeleton skeleton33 = new Skeleton();
        addObject(skeleton33, 537, 172);
        Skeleton skeleton34 = new Skeleton();
        addObject(skeleton34, 586, 275);
        Skeleton skeleton35 = new Skeleton();
        addObject(skeleton35, 552, 249);
        Skeleton skeleton36 = new Skeleton();
        addObject(skeleton36, 535, 364);
        Skeleton skeleton37 = new Skeleton();
        addObject(skeleton37, 487, 337);
        Skeleton skeleton38 = new Skeleton();
        addObject(skeleton38, 512, 376);
        Skeleton skeleton39 = new Skeleton();
        addObject(skeleton39, 464, 316);
        Skeleton skeleton40 = new Skeleton();
        addObject(skeleton40, 418, 354);
        Skeleton skeleton41 = new Skeleton();
        addObject(skeleton41, 372, 321);
        Skeleton skeleton42 = new Skeleton();
        addObject(skeleton42, 383, 359);
        Skeleton skeleton43 = new Skeleton();
        addObject(skeleton43, 342, 395);
        Skeleton skeleton44 = new Skeleton();
        addObject(skeleton44, 340, 316);
        Skeleton skeleton45 = new Skeleton();
        addObject(skeleton45, 308, 333);
        Skeleton skeleton46 = new Skeleton();
        addObject(skeleton46, 243, 384);
        Skeleton skeleton47 = new Skeleton();
        addObject(skeleton47, 243, 310);
        Skeleton skeleton48 = new Skeleton();
        addObject(skeleton48, 163, 313);
        Skeleton skeleton49 = new Skeleton();
        addObject(skeleton49, 113, 378);
        Skeleton skeleton50 = new Skeleton();
        addObject(skeleton50, 180, 380);
        Skeleton skeleton51 = new Skeleton();
        addObject(skeleton51, 41, 259);
        Skeleton skeleton52 = new Skeleton();
        addObject(skeleton52, 82, 210);
        Skeleton skeleton53 = new Skeleton();
        addObject(skeleton53, 76, 146);
        Skeleton skeleton54 = new Skeleton();
        addObject(skeleton54, 117, 103);
        Skeleton skeleton55 = new Skeleton();
        addObject(skeleton55, 118, 62);
        Skeleton skeleton56 = new Skeleton();
        addObject(skeleton56, 166, 44);
        Skeleton skeleton57 = new Skeleton();
        addObject(skeleton57, 210, 14);
        Skeleton skeleton58 = new Skeleton();
        addObject(skeleton58, 312, 48);
        Skeleton skeleton59 = new Skeleton();
        addObject(skeleton59, 327, 29);
        Skeleton skeleton60 = new Skeleton();
        addObject(skeleton60, 372, 24);
        Skeleton skeleton61 = new Skeleton();
        addObject(skeleton61, 461, 34);
        Skeleton skeleton62 = new Skeleton();
        addObject(skeleton62, 481, 58);
        Skeleton skeleton63 = new Skeleton();
        addObject(skeleton63, 445, 142);
        Skeleton skeleton64 = new Skeleton();
        addObject(skeleton64, 569, 32);
        Skeleton skeleton65 = new Skeleton();
        addObject(skeleton65, 499, 31);
        Skeleton skeleton66 = new Skeleton();
        addObject(skeleton66, 571, 267);
        Skeleton skeleton67 = new Skeleton();
        addObject(skeleton67, 366, 386);
        Skeleton skeleton68 = new Skeleton();
        addObject(skeleton68, 205, 362);
        Skeleton skeleton69 = new Skeleton();
        addObject(skeleton69, 105, 250);
        Skeleton skeleton70 = new Skeleton();
        addObject(skeleton70, 105, 243);
        Skeleton skeleton71 = new Skeleton();
        addObject(skeleton71, 135, 129);
        Skeleton skeleton72 = new Skeleton();
        addObject(skeleton72, 165, 80);
        Skeleton skeleton73 = new Skeleton();
        addObject(skeleton73, 228, 66);
        Skeleton skeleton74 = new Skeleton();
        addObject(skeleton74, 352, 62);
        Skeleton skeleton75 = new Skeleton();
        addObject(skeleton75, 453, 64);
    }

   /* public void nextScreen()
    {

        Actor ;

        if(character.getY() >= 10) 
        {
           

            Room2 go = new Room2();
            Greenfoot.setWorld(go);
        }*/
    }


