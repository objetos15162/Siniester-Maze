import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToPlay here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class ToPlay extends Button
{
    /**
     *This method is a button to go to Maze.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            NameGamer gamerWorld = new NameGamer();
            Greenfoot.setWorld(gamerWorld);
        }
    }    
}
