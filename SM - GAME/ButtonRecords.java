import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonRecords here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonRecords extends Actor
{
    /**
     * Act - do whatever the ButtonRecords wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Records newWorld= new Records();
            Greenfoot.setWorld(newWorld);
        }
    }    
}
