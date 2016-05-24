import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a class to represent the Facebook button.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Facebook extends Button
{
    /**
     * Check the clic and generate a Screen.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Screen facebookWorld = new Screen(4,0);
            Greenfoot.setWorld(facebookWorld);
        }
    }    
}
