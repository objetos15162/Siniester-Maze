import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonBack extends Actor
{
    /**
     * Act - do whatever the ButtonBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
        Start newWorld= new Start();
        Greenfoot.setWorld(newWorld);
        }
    }    
}
