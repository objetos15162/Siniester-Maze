import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Saw here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Saw extends Enemy
{
    /**
     * Constructor for objects of class Saw. This access to super class to get a random 
     * direction to this enemy.
     */
    public Saw()
    {
        super.setMoveAux(Greenfoot.getRandomNumber(4));
    }
    
    /**
     * Act - do whatever the Saw wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
    }   
}
