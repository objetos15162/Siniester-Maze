import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToCredit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToCredit extends Button
{
    /**
     *This method is a button to go to a Screen with the Credits of the game.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Screen creditWorld = new Screen(1);
            Greenfoot.setWorld(creditWorld);
        }
    }    
}
