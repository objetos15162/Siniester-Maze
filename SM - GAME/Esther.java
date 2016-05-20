import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Esther here.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Esther extends Enemy
{
    private Knife knife;
    
    /**
     * Constructor for objects of class Esther. This access to super class to get a random 
     * direction to this enemy and initialize a object of Knife type to be throw for Esther.
     */
    public Esther()
    {
        knife = new Knife();
        super.setMoveAux(Greenfoot.getRandomNumber(4));
    }
    
    /**
     * Act - do whatever the Esther wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
        World mundo = getWorld();
        Maze myWorld = (Maze)mundo;
        myWorld.addObject(knife,getX(),getY());
    }   
}
