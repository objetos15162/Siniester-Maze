import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maze4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze4 extends World
{
    private SimpleTimer timer;
    private Counter timerDisplay;
    private Counter keysDisplay;
    private Counter cluesDisplay;
    
    /**
     * Constructor for objects of class Maze4.
     * 
     */
    public Maze4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1025, 825, 1);
        timerDisplay = new Counter(" ");
        addObject(timerDisplay,351,36);
        keysDisplay =new Counter(" ");
        addObject(keysDisplay,805,22);
        cluesDisplay =new Counter(" ");
        addObject(cluesDisplay,804,52);
        timer = new SimpleTimer();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ButtonBack buttonback = new ButtonBack();
        addObject(buttonback,904,784);
    }
    
    @Override
    public void act()
    {      
      //CONTADOR DE TIEMPO
      if(timer.millisElapsed()>1000)
      {
       timerDisplay.add(1);  
       timer.mark();
      }
    }
    
    public Counter getClues()
    {
        return cluesDisplay;
    }
    
    public Counter getKeys()
    {
        return keysDisplay;
    }

}
