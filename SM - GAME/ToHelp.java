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
     *This method is a button to go to a Screen with the information of help.
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
