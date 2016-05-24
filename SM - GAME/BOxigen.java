import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a class to represent the Bar Oxigen.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class BOxigen extends Bar
{
    /**
     * Act - do whatever the BOxigen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        World mundo = getWorld();
        Maze myWorld = (Maze)mundo;

        if(myWorld.getBrad().getOxigen()==100)
        {
            setImage("SM - BarOxigen100.png");
        }

        if(myWorld.getBrad().getOxigen()==75)
        {
            setImage("SM - BarOxigen75.png");
        }

        if(myWorld.getBrad().getOxigen()==50)
        {
            setImage("SM - BarOxigen50.png");
        }

        if(myWorld.getBrad().getOxigen()==25)
        {
            setImage("SM - BarOxigen25.png");
        }

        if(myWorld.getBrad().getOxigen()==0)
        {
            setImage("SM - BarOxigen0.png");
        }
    }    
}
