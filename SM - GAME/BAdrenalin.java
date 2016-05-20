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
     * This method set a image relationed with the adrenalin of GamerBrad.
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
            Screen lostWorld= new Screen(2);
            Greenfoot.setWorld(lostWorld);
        }
        
    }    
}
