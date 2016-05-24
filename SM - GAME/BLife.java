import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a class to represent the Bar Life.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class BLife extends Bar
{
    /**
     * Act - do whatever the BLife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        World mundo = getWorld();
        Maze myWorld = (Maze)mundo;

        if(myWorld.getBrad().getLife()==100)
        {
            setImage("SM - BarLife100.png");
        }

        if(myWorld.getBrad().getLife()==75)
        {
            setImage("SM - BarLife75.png");
        }

        if(myWorld.getBrad().getLife()==50)
        {
            setImage("SM - BarLife50.png");
        }

        if(myWorld.getBrad().getLife()==25)
        {
            setImage("SM - BarLife25.png");
        }

        if(myWorld.getBrad().getLife()==0)
        {
            Screen lostWorld= new Screen(2,myWorld.getActualTime());
            Greenfoot.setWorld(lostWorld);
        }
    }    
}
