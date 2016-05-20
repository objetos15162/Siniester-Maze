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
     *This method is a button to go to a Start for choose a option in the game.
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
