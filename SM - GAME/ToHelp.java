import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToHelp here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class ToHelp extends Button
{
    /**
     * Act - do whatever the ToHelp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Screen helpWorld = new Screen(0);
            Greenfoot.setWorld(helpWorld);
        }
    }    
}
