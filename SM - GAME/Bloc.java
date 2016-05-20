import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bloc here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Bloc extends Actor
{
    /**
     * Act - do whatever the Bloc wants to do. This method is called whenever
     * The method check if a Knife is touching the block and eliminate this Knife.
     */
    public void act() 
    {
        // Add your action code here.
        if(isTouching(Knife.class))
        {
            removeTouching(Knife.class);
        }
    }    
    
}
