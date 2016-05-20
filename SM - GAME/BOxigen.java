import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BOxigen here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class BOxigen extends Bar
{
    /**
     * Act - do whatever the BOxigen wants to do. This method is called whenever
     * This method set a image relationed with the oxigen of GamerBrad.
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
            Screen lostWorld= new Screen(2);
            Greenfoot.setWorld(lostWorld);
        }
    }    
}
