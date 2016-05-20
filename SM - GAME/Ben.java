import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ben here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Ben extends Enemy
{
    /**
     * Constructor for objects of class Ben. This access to super class to get a random 
     * direction to this enemy.
     */
    public Ben()
    {
        super.setMoveAux(Greenfoot.getRandomNumber(4));
    }
    
    /**
     * Act - do whatever the Ben wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
    }    
}
