import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
* @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Screen extends World
{

    /**
     * Constructor for objects of class Screen.
     * 
     */
    public Screen(int option)
    {    
        // Create a new world with 900x700 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        checkOption(option);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ToBack buttonback = new ToBack();
        addObject(buttonback,764,626);
    }
      
    private void checkOption(int value)
    {
        if(value == 0)
        {
            setBackground("SM - HELP.png");
        }
        
        if(value == 1)
        {
            setBackground("SM - CREDITS.png");
        }   
        
        if(value == 2)
        {
            setBackground("SM - LOST.png");
            Greenfoot.playSound("SM - Lose.wav");
        }   
    }
}
