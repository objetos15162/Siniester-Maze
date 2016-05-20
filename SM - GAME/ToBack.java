import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class ToBack extends Button
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Start startWorld= new Start();
            Greenfoot.setWorld(startWorld);
        }
    }    
}
