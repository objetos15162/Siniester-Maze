import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a class to represent the Billy.
 * 
 * @author Corpus Sanchez Jose Eduardo 
 * @version 2.0
 */
public class Billy extends Enemy
{
    /**
     * This is the constructor of the class.
    */
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
