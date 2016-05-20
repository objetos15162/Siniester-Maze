import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
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
        super(900, 700, 1); 
        prepare();
    }
    
    /**
      * Prepare the world for the start of the program.
      * That is: create the initial objects and add them to the world.
      */
    private void prepare()
    {
       ToPlay buttonPlay = new ToPlay();
       addObject(buttonPlay,492,288);
       ToHelp buttonHelp = new ToHelp();
       addObject(buttonHelp,492,356);
       ToCredit buttonCredit = new ToCredit();
       addObject(buttonCredit,492,424);
       ToExit buttonExit = new ToExit();
       addObject(buttonExit,492,498);
       Facebook buttonFacebook = new Facebook();
       addObject(buttonFacebook,768,668);
       Twitter buttonTwitter = new Twitter();
       addObject(buttonTwitter,826,668);
    }
}
