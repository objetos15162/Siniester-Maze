import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nurse here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Nurse extends Enemy
{
    /**
     * Constructor for objects of class Nurse. This access to super class to get a random 
     * direction to this enemy.
     */
    public Nurse()
    {
        super.setMoveAux(Greenfoot.getRandomNumber(4));
    }
    
    /**
     * Act - do whatever the Nurse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * This method check the objects of type GamerBrad are around of this enemy to make it move.
     */
    public void act() 
    {
        // Add your action code here.
        if(!getObjectsInRange(100,GamerBrad.class).isEmpty())
        {
            super.act();
        }
    }
}
