import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1025, 825, 1); 
        prepare();
        //Greenfoot.playSound("01 Portrait of Mr. Boogie.mp3");
        //Greenfoot.stop();
    }
    
    /**
       * Prepare the world for the start of the program.
         * That is: create the initial objects and add them to the world.
    */
    private void prepare()
    {
       ButtonPlay buttonplay = new ButtonPlay();
       addObject(buttonplay,560,245);
       ButtonRecords buttonrecords = new ButtonRecords();
       addObject(buttonrecords,560,334);
       ButtonHelp buttonhelp = new ButtonHelp();
       addObject(buttonhelp,560,415);
       ButtonCredits buttoncredits = new ButtonCredits();
       addObject(buttoncredits,560,497);
       ButtonExit buttonexit = new ButtonExit();
       addObject(buttonexit,560,588);
    }
}
