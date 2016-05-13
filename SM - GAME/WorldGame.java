import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldGame here.
 * 
 * @author Anabel Covarrubias  
 * @version Betha 1.4
 */
public class WorldGame extends World
{
    private Label Name;
    private NamePlayer player;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public WorldGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1025, 825, 1);
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
        addObject(Name,500,380);
    } 
}

