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
