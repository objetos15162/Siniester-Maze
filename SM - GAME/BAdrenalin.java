import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BAdrenalin here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class BAdrenalin extends Bar
{
    /**
     * Act - do whatever the BAdrenalin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        World mundo = getWorld();
        Maze myWorld = (Maze)mundo;

        if(myWorld.getBrad().getAdrenalin()==100)
        {
            setImage("SM - BarAdrenalin100.png");
        }

        if(myWorld.getBrad().getAdrenalin()==75)
        {
            setImage("SM - BarAdrenalin75.png");
        }

        if(myWorld.getBrad().getAdrenalin()==50)
        {
            setImage("SM - BarAdrenalin50.png");
        }

        if(myWorld.getBrad().getAdrenalin()==25)
        {
            setImage("SM - BarAdrenalin25.png");
        }

        if(myWorld.getBrad().getAdrenalin()==0)
        {
            setImage("SM - BarAdrenalin0.png");
        }
    }    
}
