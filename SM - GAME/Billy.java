import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Billy here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Billy extends Enemy
{
    public Billy()
    {
        super.setMoveAux(Greenfoot.getRandomNumber(4));
    }
    
    /**
     * Act - do whatever the Billy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
    } 
}
