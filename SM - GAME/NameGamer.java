import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldGame here.
 * 
 * @author Eduardo Sanchez and Jocelyn Covarrubias 
 * @version Betha 1.4
 */
public class NameGamer extends World
{
    private Label Name;
    private NamePlayer player;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public NameGamer()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1);
        player = new NamePlayer();
        addObject(player,100,100);
        Name = new Label(player.getNamePlayer(),50);
     }
    
    /**
     * Method for see the name in the window of the video game. 
     */ 
    public void addName()
    { 
        Name.setValue(player.getNamePlayer());
        addObject(Name,460,341);
    } 
}